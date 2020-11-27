package datastructure.sort;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

/**
 * @author wsh
 * @date 2020/11/27 11:56
 */
public class ShellVsInsertSort {

    public static void main(String[] args) {
        // 创建要给 80000 个的随机的数组
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            // 生成一个[0, 8000000) 数
            arr[i] = new Random().nextInt(80000);
        }
        Instant start = Instant.now();
//        insertSort(arr);
//        shellSwapSort(arr);
        shellGressionSort(arr);
        Instant end = Instant.now();
        long millis = Duration.between(start, end).toMillis();
        System.out.println("希尔排序(移位法)执行时间：" + millis + " 毫秒");
    }

    /**
     * 简单插入排序
     */
    private static void insertSort(int[] arr) {
        int insertVal;
        int insertIndex;
        for (int i = 1; i < arr.length; i++) {
            // 待插入的数
            insertVal = arr[i];
            // 待插入的数的前一个位置的坐标
            insertIndex = i - 1;
            // insertIndex >= 0 保证在给insertVal 找插入位置，不越界
            // insertVal < arr[insertIndex]
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }
        }
    }

    /**
     * 希尔排序-交换法
     * @param arr array
     */
    private static void shellSwapSort(int[] arr) {
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
    }

    /**
     * 希尔排序-移位法
     * @param arr array
     */
    private static void shellGressionSort(int[] arr) {
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
    }
}
