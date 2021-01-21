package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-20 14:23
 */
public class UserThreadTest {

    public static void main(String[] args) {

        Thread userThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;) {}
            }
        });

        userThread.start();

        System.out.println("main thread is over");

    }
}
