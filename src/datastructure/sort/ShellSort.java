package datastructure.sort;

import java.util.Arrays;

/**
 * @author wsh
 * @date 2020/9/24 1:29 下午
 */
public class ShellSort {

    public static void main(String[] args) {
//        sort();
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
//        sort(arr);
        sort2(arr);
    }

    /**
     * 希尔排序-交换法
     * @param arr array
     */
    private static void sort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int temp = 0;
        // 先分组，gap是多少组
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                // 遍历各组中所有元素，共gap组，步长也是gap
                for (int j = i - gap; j >= 0; j -= gap) {
                    // 如果当前元素大于加上步长后的元素，就交换位置
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 希尔排序-移位法
     * @param arr array
     */
    private static void sort2(int[] arr) {
        System.out.println(Arrays.toString(arr));
        // 先分组，gap是多少组
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // 从第gap个元素，逐个对其所在的组进行直接插入排序
            for (int i = gap; i < arr.length;i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        // 移动
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    // 退出while后，就给temp找到插入的位置
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
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
