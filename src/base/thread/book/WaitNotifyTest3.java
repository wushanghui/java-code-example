package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-14 14:19
 */
public class WaitNotifyTest3 {

/**
 * 资源A
 */
private static volatile Object resourceA = new Object();

public static void main(String[] args) throws InterruptedException {
    Thread threadA = new Thread(new Runnable() {
        @Override
        public void run() {
            // 获取resourceA共享资源的监视器锁
            synchronized (resourceA) {

                System.out.println("threadA get resourceA lock");

                try {
                    System.out.println("threadA start wait");
                    resourceA.wait();
                    System.out.println("threadA end wait");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });

    Thread threadB = new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (resourceA) {
                System.out.println("threadB get resourceA lock");

                try {
                    System.out.println("threadB start wait");
                    resourceA.wait();
                    System.out.println("threadB end wait");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });

    Thread threadC = new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (resourceA) {
                System.out.println("threadC begin notify");
                resourceA.notifyAll();
            }
        }
    });

    threadA.start();
    threadB.start();

    Thread.sleep(1000);
    threadC.start();

    threadA.join();
    threadB.join();
    threadC.join();

    System.out.println("main over");
}
}
