package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-16 09:47
 */
public class InterruptTest4 {

    public static void main(String[] args) throws InterruptedException {

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {

                // 中断标志为true时会退出循环，并且清除中断标志
                while (!Thread.interrupted()) {}

                System.out.println("threadA isInterrupted:"+Thread.currentThread().isInterrupted());

            }
        });

        threadA.start();

        // 设置中断标志
        threadA.interrupt();

        threadA.join();

        System.out.println("main thread is over");

    }
}
