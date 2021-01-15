package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-14 16:22
 */
public class WaitTimeoutTest {

    private static Object obj = new Object();

    public static void main(String[] args) {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("----begin----");

                    synchronized (obj) {
                        System.out.println("wait before");
                        // wait()方法指定了超时时间，如果在该超时时间内没有其他线程调用该共享变量的notify()或者notifyAll()方法唤醒，
                        // 也会因为超时而返回
                        obj.wait(1000);
                        System.out.println("wait after");
                    }
                    System.out.println("----end----");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadA.start();
    }
}
