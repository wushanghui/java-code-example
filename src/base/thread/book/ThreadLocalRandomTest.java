package base.thread.book;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author wsh
 * @date 2021/1/28 14:05
 */
public class ThreadLocalRandomTest {

    public static void main(String[] args) {
        // 获取一个随机数生成器
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            // threadLocalRandom.nextInt(5) 输出一个[0,5)之间的随机数
            System.out.println(threadLocalRandom.nextInt(5));
        }
    }
}
