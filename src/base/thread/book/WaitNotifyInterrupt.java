package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-14 15:30
 */
public class WaitNotifyInterrupt {

    static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("----begin----");

                    synchronized (obj) {
                        obj.wait();
                    }
                    System.out.println("----end----");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadA.start();

        Thread.sleep(1000);

        System.out.println("----begin interrupt threadA----");
        threadA.interrupt();
        System.out.println("----end interrupt threadA----");
    }
}
