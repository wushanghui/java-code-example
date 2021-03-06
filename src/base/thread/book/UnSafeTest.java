package base.thread.book;

import sun.misc.Unsafe;

/**
 * @author wsh
 * @date 2021/1/22 15:09
 */
public class UnSafeTest {

    /** unsafe 实例 */
    static final Unsafe unsafe = Unsafe.getUnsafe();

    /** 记录变量state 在类 UnSafeTest 中的偏移量 */
    static long stateOffset;

    /** 变量state */
    private volatile long state = 0;

    static {
        try {
            // 获取state变量 在类 UnSafeTest 中的偏移量
            stateOffset = unsafe.objectFieldOffset(UnSafeTest.class.getDeclaredField("state"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 创建实例，设置state 为 1
        UnSafeTest test = new UnSafeTest();
        boolean success = unsafe.compareAndSwapInt(test, stateOffset, 0, 1);
        System.out.println(success);
    }
}
