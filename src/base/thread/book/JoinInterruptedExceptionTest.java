package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-15 16:34
 */
public class JoinInterruptedExceptionTest {

    public static void main(String[] args) {

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("child threadOne begin run!");
                // threadOne 放一个死循环
                for (;;) {
                }
            }
        });


        // 获取主线程
        final Thread mainThread = Thread.currentThread();

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {

                // threadTwo 上来就休眠1s
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 中断主线程
                mainThread.interrupt();
            }
        });

        threadOne.start();
        threadTwo.start();

        try {
            threadOne.join();
        } catch (InterruptedException e) {
            System.out.println("main thread:" + e);
        }

    }
}
