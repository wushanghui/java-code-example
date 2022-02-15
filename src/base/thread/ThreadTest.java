package base.thread;

/**
 * @author 吴尚慧
 * @since 2022/2/15 21:44
 */
public class ThreadTest {

    public static void main(String[] args) {
        int COUNT_BITS = Integer.SIZE - 3;
        System.out.println(COUNT_BITS);
        int RUNNING    = -1 << COUNT_BITS;
        System.out.println(RUNNING);
        System.out.println(Integer.toBinaryString(RUNNING));
    }
}
