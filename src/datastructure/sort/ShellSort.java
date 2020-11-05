package datastructure.sort;

import java.util.Arrays;

/**
 * @author wsh
 * @date 2020/9/24 1:29 下午
 */
public class ShellSort {

    public static void main(String[] args) {
        sort();
    }

    public static void sort() {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        System.out.println("排序之前的数组：");
        System.out.println(Arrays.toString(arr));
        int temp;
        // 第1轮 10个数据分为5组
        for (int i = 5; i < arr.length; i++) {
            for (int j = i - 5; j >= 0; j -= 5) {
                if (arr[j] > arr[j + 5]) {
                    temp = arr[j];
                    arr[j] = arr[j + 5];
                    arr[j + 5] = temp;
                }
            }
        }
        System.out.println("第1轮插入后：");
        System.out.println(Arrays.toString(arr));

        // 第2轮 10个数据分为 5/2 = 2 组
        for (int i = 2; i < arr.length; i++) {
            for (int j = i - 2; j >= 0; j -= 2) {
                if (arr[j] > arr[j + 2]) {
                    temp = arr[j];
                    arr[j] = arr[j + 2];
                    arr[j + 2] = temp;
                }
            }
        }
        System.out.println("第2轮插入后：");
        System.out.println(Arrays.toString(arr));

        // 第3轮 10个数据分为 2/2 = 1 组
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j -= 1) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("第3轮插入后：");
        System.out.println(Arrays.toString(arr));
    }
}
