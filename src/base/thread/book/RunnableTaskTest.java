package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-14 10:52
 */
public class RunnableTaskTest {

    public static class RunnableTask implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": 我是一个子线程");
        }
    }

    public static void main(String[] args) {
        RunnableTask task = new RunnableTask();
        new Thread(task).start();
        new Thread(task).start();
    }
}
