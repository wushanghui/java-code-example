package base.thread.book;

import sun.misc.Unsafe;

/**
 * @author wsh
 * @date 2021/1/22 15:09
 */
public class UnSafeTest {

    static final Unsafe unsafe = Unsafe.getUnsafe();

    static long stateOffset;

    private volatile long state = 0;

    static {
        try {
            stateOffset = unsafe.objectFieldOffset(UnSafeTest.class.getDeclaredField("state"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UnSafeTest test = new UnSafeTest();
        boolean success = unsafe.compareAndSwapInt(test, stateOffset, 0, 1);
        System.out.println(success);
    }
}
