package base.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author wsh
 * @date 2019/11/19 14:36
 * 两个扩展数组的方法测试
 */
public class CopyOfTest {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"jerry", "tom", "harry"};
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        //强转会抛出异常
        /*
        Exception in thread "main" java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.String;
	    at base.arrays.CopyOfTest.main(CopyOfTest.java:27)
         */
        b = (String[]) badCopyOf(b, 10);

        /*
        结果：
            [1, 2, 3, 4, 5]
            [jerry, tom, harry]
            Exception in thread "main" java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.String;
                at base.arrays.CopyOfTest.main(CopyOfTest.java:27)
         */
    }

    public static Object[] badCopyOf(Object[] a, int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    public static Object goodCopyOf(Object a, int newLength) {
        Class<?> cl = a.getClass();
        if (!cl.isArray()) {
            return null;
        }
        Class<?> componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, length);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
