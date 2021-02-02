package base.thread.book;

import java.util.concurrent.locks.LockSupport;

/**
 * @author wsh
 * @date 2021/2/2 16:49
 */
public class LockSupportTest4 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("child thread begin park!");

                // 只有被中断才推出循环
                while (!Thread.currentThread().isInterrupted()) {
                    // 调用park方法，挂起自己
                    LockSupport.park();
                }

                System.out.println("child thread unpark!");
            }
        });

        thread.start();

        Thread.sleep(1000);

        System.out.println("main thread begin unpark!");

        // 中断子线程
        thread.interrupt();
    }
}
