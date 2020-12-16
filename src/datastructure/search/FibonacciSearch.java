package datastructure.search;

import java.util.Arrays;

/**
 * @author wsh
 * @date 2020/12/16 16:06
 */
public class FibonacciSearch {

    public static int maxSize = 20;

    public static void main(String[] args) {
        int[] arr = {1, 8, 10, 89, 1000, 1234};
    }

    /**
     * 生成一个斐波那契数列
     * @return 斐波那契数列
     */
    public static int[] fibonacci() {
        int[] f = new int[maxSize];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < maxSize; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;
    }

    /**
     * 斐波那契查找算法
     * @param arr 数组
     * @param key 要查找的值
     * @return key所在数组的小标，查不到为-1
     */
    public static int fibonacciSearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;
        // 表示斐波那契分割数值的下标
        int k =0;
        int mid = 0;
        int[] f = fibonacci();
        while (high > f[k] -1) {
            k++;
        }

        int[] temp = Arrays.copyOf(arr, f[k]);

        for (int i = high + 1; i < temp.length; i++) {
            temp[i]=arr[high]
        }
    }
}
