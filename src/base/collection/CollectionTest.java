package base.collection;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wsh
 * @date 2020-07-13 20:06
 */
public class CollectionTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = new int[10];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        for (int i : a) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.arraycopy(a, 2, a, 3, 4-2);
        a[2]=9;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    @Test
    public void ArraysCopyOfTest() {
        int[] a = new int[3];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        for (int i : a) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int[] b = Arrays.copyOf(a, 10);
        for (int i : b) {
            System.out.print(a[i] + " ");
        }
    }
}
