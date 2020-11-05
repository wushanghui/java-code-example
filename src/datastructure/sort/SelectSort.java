package datastructure.sort;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

/**
 * @author wsh
 * @date 2020/9/22 4:18 下午
 * 选择排序
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Instant start = Instant.now();
        selectSort(arr);
        Instant end = Instant.now();
        System.out.println("执行时间：" + Duration.between(start, end).toMillis() + " 毫秒");
        //System.out.println("执行时间："+ Duration.between(start, end).getSeconds()+" 秒");
    }

    public static void selectSort(int[] arr) {
        System.out.println("排序之前的数组：");
        System.out.println(Arrays.toString(arr));

        for (int m = 0; m < arr.length - 1; m++) {
            int minIndex = m;
            int min = arr[m];
            for (int i = m + 1; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            // 将最小值交换到前面
            if (minIndex != m) {
                arr[minIndex] = arr[m];
                arr[m] = min;
            }
            System.out.println("第" + (m + 1) + "轮交换后：");
            System.out.println(Arrays.toString(arr));
        }

    }

    /**
     * 逐步推导 选择排序
     */
    public static void sort() {
        int[] arr = {2, 1, 6, 3};
        System.out.println("排序之前的数组：");
        System.out.println(Arrays.toString(arr));

        // 第1轮
        int minIndex = 0;
        int min = arr[0];
        for (int i = 0 + 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        // 将最小值交换到前面
        if (minIndex != 0) {
            arr[minIndex] = arr[0];
            arr[0] = min;
        }
        System.out.println("第1轮交换后：");
        System.out.println(Arrays.toString(arr));

        // 第2轮
        minIndex = 1;
        min = arr[1];
        for (int i = 1 + 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        // 将最小值交换到前面
        if (minIndex != 1) {
            arr[minIndex] = arr[1];
            arr[1] = min;
        }
        System.out.println("第2轮交换后：");
        System.out.println(Arrays.toString(arr));

        // 第3轮
        minIndex = 2;
        min = arr[2];
        for (int i = 2 + 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        // 将最小值交换到前面
        if (minIndex != 2) {
            arr[minIndex] = arr[2];
            arr[2] = min;
        }
        System.out.println("第3轮交换后：");
        System.out.println(Arrays.toString(arr));

    }
}
