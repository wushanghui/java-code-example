package datastructure.recursion;

import base.Test3;

/**
 * @author wsh
 * @date 2020/9/15 5:09 下午
 * 递归问题
 */
public class RecursionTest {

    public static void main(String[] args) {
        print(9);
        System.out.println();
        int num = 4;
        int factorial = factorial(num);
        System.out.println(num + " factorial=" + factorial);
    }

    /**
     * 打印问题
     */
    public static void print(int n) {
        if (n > 1) {
            print(n - 1);
        }
        System.out.println("n=" + n);
    }

    /**
     * 阶乘问题
     */
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
