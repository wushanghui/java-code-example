package base.thread.book;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author wsh
 * @date 2021/1/22 15:09
 */
public class UnSafeTest2 {

    /** unsafe 实例 */
    static Unsafe unsafe;

    /** 记录变量state 在类 UnSafeTest 中的偏移量 */
    static long stateOffset;

    /** 变量state */
    private volatile long state = 0;

    static {
        try {
            // 使用反射获取Unsafe的成员变量theUnsafe
            Field field = Unsafe.class.getDeclaredField("theUnsafe");

            // 设置为可存取
            field.setAccessible(true);

            unsafe = (Unsafe) field.get(null);
            // 获取state变量 在类 UnSafeTest 中的偏移量
            stateOffset = unsafe.objectFieldOffset(UnSafeTest2.class.getDeclaredField("state"));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 创建实例，设置state 为 1
        UnSafeTest2 test = new UnSafeTest2();
        boolean success = unsafe.compareAndSwapInt(test, stateOffset, 0, 1);
        System.out.println(success);
    }
}
