package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-14 14:19
 */
public class WaitNotifyTest {

    /**
     * 资源A
     */
    private static volatile Object resourceA = new Object();
    /**
     * 资源B
     */
    private static volatile Object resourceB = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (resourceA) {
                        // 获取resourceA共享资源的监视器锁
                        System.out.println("threadA 获取到 resourceA 监视器锁");

                        // 获取resourceB共享资源的监视器锁
                        synchronized (resourceB) {
                            System.out.println("threadA 获取到 resourceB 监视器锁");

                            // 线程A阻塞， 并释放获取到的resourceA锁
                            System.out.println("threadA 释放 resourceA 监视器锁");
                            resourceA.wait();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    // 睡眠1s
                    Thread.sleep(1000);

                    synchronized (resourceA) {
                        // 获取resourceA共享资源的监视器锁
                        System.out.println("threadB 获取到 resourceA 监视器锁");

                        System.out.println("threadB 尝试获取 resourceB 监视器锁...");
                        // 获取resourceB共享资源的监视器锁
                        synchronized (resourceB) {
                            System.out.println("threadB 获取到 resourceB 监视器锁");

                            // 线程B阻塞， 并释放获取到的resourceA锁
                            System.out.println("threadB 释放 resourceA 监视器锁");
                            resourceA.wait();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println("main over");
    }
}
