package datastructure.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author wsh
 * @date 2020/11/27 17:27
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {2, 10, 8, 22, 34, 5, 12, 28, 21, 11};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 快速排序
     *
     * @param arr   数组
     * @param left  左边界下标
     * @param right 右边界下标
     */
    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[(left + right) / 2];
        int temp = 0;
        // 比pivot小的值放左边，比pivot大的值放右边
        while (l < r) {
            // 在pivot左边找，找到大于等于pivot的为止
            while (arr[l] < pivot) {
                l += 1;
            }
            //
            while (arr[r] > pivot) {
                r -= 1;
            }
            // 如果l >= r，说明pivot的左右两边的值已经就绪（也就是左边的值都比pivot小，右边都比pivot大，都包括相等）
            if (l >= r) {
                break;
            }

            // 交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            // 前移
            if (arr[l] == pivot) {
                r -= 1;
            }

            // 后移
            if (arr[r] == pivot) {
                l += 1;
            }
        }

        if (l == r) {
            l += 1;
            r -= 1;
        }

        // 向左递归
        if (left < r) {
            quickSort(arr, left, r);
        }

        // 向右递归
        if (right > l) {
            quickSort(arr, l, right);
        }

    }
}
