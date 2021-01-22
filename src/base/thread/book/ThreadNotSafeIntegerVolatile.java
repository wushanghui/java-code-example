package base.thread.book;

/**
 * @author wsh
 * @date 2021/1/22 10:15
 */
public class ThreadNotSafeIntegerVolatile implements Runnable {

    private volatile int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ThreadNotSafeIntegerVolatile{" +
                "value=" + value +
                '}';
    }

    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
            value++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadNotSafeIntegerVolatile threadNotSafeInteger = new ThreadNotSafeIntegerVolatile();
        Thread threadA = new Thread(threadNotSafeInteger);
        Thread threadB = new Thread(threadNotSafeInteger);

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println(threadNotSafeInteger);
    }
}
