package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-20 13:24
 */
public class DeadLockTest2 {

    private static Object resourceA = new Object();
    private static Object resourceB = new Object();

    public static void main(String[] args) {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA) {
                    System.out.println(Thread.currentThread() + " get ResourceA");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread() + " waiting get ResourceB");

                    synchronized (resourceB) {
                        System.out.println(Thread.currentThread() + " get ResourceB");
                    }
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA) {
                    System.out.println(Thread.currentThread() + " get resourceA");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread() + " waiting get ResourceB");

                    synchronized (resourceB) {
                        System.out.println(Thread.currentThread() + " get ResourceB");
                    }
                }
            }
        });

        // 启动线程
        threadA.start();
        threadB.start();
    }

}
