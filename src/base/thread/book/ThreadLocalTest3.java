package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-17 15:20
 */
public class ThreadLocalTest3 {

    public static ThreadLocal<String> threadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set("hello world");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("child thread:" + ":" + threadLocal.get());
            }
        });

        thread.start();

        System.out.println("main thread:" + threadLocal.get());
    }
}
