package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-16 09:47
 */
public class InterruptTest {

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                // 如果当前线程被中断则退出循环
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread() + " hello");
                }
            }
        });

        threadA.start();

        Thread.sleep(1000);

        System.out.println("main thread interrupt child threadA");
        threadA.interrupt();

        threadA.join();
        System.out.println("main is over");

    }
}
