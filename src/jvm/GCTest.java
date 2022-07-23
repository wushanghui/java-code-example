package jvm;

/**
 * @author 吴尚慧
 * @since 2022/7/23 9:59
 */
public class GCTest {

    public static void main(String[] args) {
        byte[] allocation1, allocation2;
        allocation1 = new byte[65536*1024];
    }
}
