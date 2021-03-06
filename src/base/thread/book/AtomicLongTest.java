package base.thread.book;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author jue
 * @date 2021/1/28 22:06
 * @describe
 */
public class AtomicLongTest {

    /**
     * 原子计数器
     */
    private static AtomicLong atomicLong = new AtomicLong();

    /**
     * 数据源
     */
    private static Integer[] arrayOne = new Integer[]{0, 1, 2, 3, 0, 6, 2, 8, 0, 4};
    private static Integer[] arrayTwo = new Integer[]{7, 10, 0, 3, 6, 0, 2, 0, 0, 7};

    public static void main(String[] args) throws InterruptedException {
        // threadOne 统计 arrayOne 数组中 0 的个数
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                int size = arrayOne.length;
                for (int i = 0; i < size; i++) {
                    if (arrayOne[i].intValue() == 0) {
                        atomicLong.incrementAndGet();
                    }
                }
            }
        });

        // threadTwo 统计 arrayTwo 数组中 0 的个数
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                int size = arrayTwo.length;
                for (int i = 0; i < size; i++) {
                    if (arrayTwo[i].intValue() == 0) {
                        atomicLong.incrementAndGet();
                    }
                }
            }
        });

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();

        System.out.println("count 0: " + atomicLong.get());
    }
}
