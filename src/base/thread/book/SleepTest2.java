package base.thread.book;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wsh
 * @date 2021-01-15 17:08
 */
public class SleepTest2 {

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("child threadA is in sleep");

                    Thread.sleep(10000);

                    System.out.println("child ThreadA is in awake");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 启动线程
        threadA.start();

        // 主线程休眠2s
        Thread.sleep(2000);

        // 主线程中断子线程
        threadA.interrupt();
    }
}
