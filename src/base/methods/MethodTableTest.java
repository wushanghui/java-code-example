package base.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wsh
 * @date 2019/11/19 16:32
 */
public class MethodTableTest {

    public static void main(String[] args) throws NoSuchMethodException {
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);
        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
        /*
        结果：
            public static double base.methods.MethodTableTest.square(double)
                1.0    |    1.0
                2.0    |    4.0
                3.0    |    9.0
                4.0    |    16.0
                5.0    |    25.0
                6.0    |    36.0
                7.0    |    49.0
                8.0    |    64.0
                9.0    |    81.0
                10.0    |    100.0
            public static double java.lang.Math.sqrt(double)
                1.0    |    1.0
                2.0    |    1.4142135623730951
                3.0    |    1.7320508075688772
                4.0    |    2.0
                5.0    |    2.23606797749979
                6.0    |    2.449489742783178
                7.0    |    2.6457513110645907
                8.0    |    2.8284271247461903
                9.0    |    3.0
                10.0    |    3.1622776601683795
         */
    }

    /**
     * 返回一个平方数
     * @param x 数字
     * @return x 平方
     */
    public static double square(double x) {
        return x * x;
    }

    public static void printTable(double from, double to, int n, Method f) {
        System.out.println(f);
        double dx = (to - from) / (n - 1);
        for (double x = from; x <= to; x += dx) {
            try {
                double y = (Double) f.invoke(null, x);
                System.out.println("    " + x + "    |    " + y);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
