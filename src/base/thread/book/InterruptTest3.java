package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-16 09:47
 */
public class InterruptTest3 {

    public static void main(String[] args) throws InterruptedException {

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {

                for (; ; ) {
                }

            }
        });

        threadA.start();

        // 设置中断标志
        threadA.interrupt();

        // 获取中断标志
        System.out.println("isInterrupted:" + threadA.isInterrupted());

        // 获取中断标志并重置
        System.out.println("isInterrupted:" + threadA.interrupted());

        // 获取中断表示并重置
        System.out.println("isInterrupted:" + Thread.interrupted());

        // 获取中断标志
        System.out.println("isInterrupted:" + threadA.isInterrupted());

        threadA.join();

        System.out.println("main thread is over");

    }
}
