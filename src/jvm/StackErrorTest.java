package jvm;

/**
 * @author 吴尚慧
 * @since 2022/7/16 3:32 下午
 */
public class StackErrorTest {

    private static int count = 1;

    public static void main(String[] args) {
        System.out.print(count++);
        System.out.print(", ");
        main(args);
    }
}
