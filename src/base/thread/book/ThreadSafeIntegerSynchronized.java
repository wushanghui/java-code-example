package base.thread.book;

/**
 * @author wsh
 * @date 2021/1/22 10:15
 */
public class ThreadSafeIntegerSynchronized implements Runnable {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ThreadSafeIntegerSynchronized{" +
                "value=" + value +
                '}';
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 20000; i++) {
                value++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSafeIntegerSynchronized threadSafeInteger = new ThreadSafeIntegerSynchronized();
        Thread threadA = new Thread(threadSafeInteger);
        Thread threadB = new Thread(threadSafeInteger);

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println(threadSafeInteger);
    }
}
