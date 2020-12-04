package datastructure.sort;

import java.util.Arrays;

/**
 * @author wsh
 * @date 2020/12/1 17:17
 */
public class MergeSort {


    public static void main(String[] args) {
        int[] arr = { 8, 4, 5, 7, 1, 3, 6, 2 };
        int[] temp = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));
    }
    /**
     * 归并排序
     *
     * @param arr
     * @param left
     * @param right
     * @param temp
     */
    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            // 向左递归进行分解
            mergeSort(arr, left, mid, temp);
            // 向右递归进行分解
            mergeSort(arr, mid + 1, right, temp);
            // 合并
            merge(arr, left, mid, right, temp);
        }
    }

    /**
     * 合并
     *
     * @param arr   原始数组
     * @param left  左边有序序列的初始索引
     * @param mid   中间索引
     * @param right 右边索引
     * @param temp  中转的数组
     */
    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        // 左边有序序列的初始索引
        int i = left;
        // 右边有序序列的初始索引
        int j = mid + 1;
        // temp 数组的当前索引
        int t = 0;


        while (i <= mid && j <= right) {
            // 如果左边元素小于右边元素，就把左边元素填充到temp数组, 反之，右边填充到temp数组
            if (arr[i] <= arr[j]) {
                temp[t] = arr[i];
                t += 1;
                i += 1;
            } else {
                temp[t] = arr[j];
                t += 1;
                j += 1;
            }
        }

        while (i <= mid) {
            temp[t] = arr[i];
            t += 1;
            i += 1;
        }

        while (j <= right) {
            temp[t] = arr[j];
            t += 1;
            j += 1;
        }

        t = 0;
        int tempLeft = left;
        while (tempLeft <= right) {
            arr[tempLeft] = temp[t];
            t += 1;
            tempLeft += 1;
        }
    }
}
