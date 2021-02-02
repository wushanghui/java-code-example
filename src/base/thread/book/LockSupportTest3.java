package base.thread.book;

import java.util.concurrent.locks.LockSupport;

/**
 * @author wsh
 * @date 2021/2/2 16:49
 */
public class LockSupportTest3 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("child thread begin park!");
                // 调用park方法，挂起自己
                LockSupport.park();

                System.out.println("child thread unpark!");
            }
        });

        thread.start();

        Thread.sleep(1000);

        System.out.println("main thread begin unpark!");
        LockSupport.unpark(thread);
    }
}
