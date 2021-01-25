package base.thread.book;

import java.util.Random;

/**
 * @author wsh
 * @date 2021/1/25 4:06 下午
 */
public class RandomTest {

    public static void main(String[] args) {
        // 创建一个默认种子的随机数生成器
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // random.nextInt(5) 输出一个[0,5)之间的随机数
            System.out.println(random.nextInt(5));
        }
    }
}
