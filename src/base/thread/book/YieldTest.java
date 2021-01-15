package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-15 17:48
 */
public class YieldTest implements Runnable {

    YieldTest() {
        // 创建并启动线程
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        // 当i=0时，让出CPU执行权，放弃时间片，进行下一轮调度
        for (int i = 0; i < 5; i++) {
            if ((i % 5) == 0) {
                System.out.println(Thread.currentThread() + " yield cpu...");

                // 当前线程让出CPU执行权，放弃时间片，进行下一轮调度
                // Thread.yield();
            }
        }
        System.out.println(Thread.currentThread() + " is over!");
    }

    public static void main(String[] args) {
        new YieldTest();
        new YieldTest();
        new YieldTest();
    }
}
