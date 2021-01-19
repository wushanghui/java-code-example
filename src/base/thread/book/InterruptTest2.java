package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-16 09:47
 */
public class InterruptTest2 {

    public static void main(String[] args) throws InterruptedException {

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    System.out.println("threadA begin sleep for 2000s");
                    Thread.sleep(2000000);
                    System.out.println("threadA awaking");
                } catch (InterruptedException e) {
                    System.out.println("threadA is interrupted while sleeping");
                    return;
                }

                System.out.println("threadA-leaving normally");
            }
        });

        threadA.start();

        // 确保子线程进入休眠状态
        Thread.sleep(1000);

        // 打断子线程的休眠，让子线程从sleep函数返回
        threadA.interrupt();

        // 等待子线程执行完毕
        threadA.join();

        System.out.println("main thread is over");

    }
}
