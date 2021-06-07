package base.thread.book;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/**
 * @author wsh
 * @date 2021/2/9 11:21 下午
 * 先进先出 互斥锁
 */
public class FIFOMutex {

    private final AtomicBoolean locked = new AtomicBoolean(false);
    private final Queue<Thread> waiters = new ConcurrentLinkedDeque<>();

    public void lock() {
        boolean wasInterrupted = false;
        Thread current = Thread.currentThread();
        waiters.add(current);

        // 只有队首的线程可以获取锁
        // 如果当前线程不是队首或者当前锁已经被其他线程获取，则调用 park 方法挂起自己。
        while (waiters.peek() != current || !locked.compareAndSet(false, true)) {
            LockSupport.park(this);
            // 如果 park方法是因为被中断而返回，则忽略中断，并且重置中断标志，做个标记，然后再次判断当前线程是不是队首元素或者当前锁是否已经被其他线程获取，如果是则继续调用 park 方法挂起自己。
            if (Thread.interrupted()) {
                wasInterrupted = true;
            }
        }

        waiters.remove();
        // 如果标记为true 则中断该线程，这个怎么理解呢?
        // 其实就是其他线程中断了该线程，虽然我对中断信号不感兴趣，忽略它，但是不代表其他线程对该标志不感兴趣，所以要恢复下。
        if (wasInterrupted) {
            current.interrupt();
        }
    }

    public void unlock() {
        locked.set(false);
        LockSupport.unpark(waiters.peek());
    }
}
