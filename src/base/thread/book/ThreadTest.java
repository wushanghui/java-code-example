package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-13 18:26
 */
public class ThreadTest {

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": 我是一个子线程");
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
