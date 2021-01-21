package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-20 14:23
 */
public class DaemonThreadTest {

    public static void main(String[] args) {

        Thread daemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;) {}
            }
        });

        // 设置为守护线程
        daemonThread.setDaemon(true);
        daemonThread.start();

        System.out.println("main thread is over");

    }


}
