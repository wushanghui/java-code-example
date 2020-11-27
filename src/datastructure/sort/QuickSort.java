package datastructure.sort;

/**
 * @author wsh
 * @date 2020/11/27 17:27
 */
public class QuickSort {

    public static void main(String[] args) {

    }

    /**
     * 快速排序
     * @param arr 数组
     * @param left 左边界下标
     * @param right 右边界下标
     */
    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[(left + right) / 2];
        int temp = 0;
        // 比pivot小的值放左边，比pivot大的值放右边
        while (l < r) {
            //
            while (arr[l] < pivot) {
                l += 1;
            }
        }
    }
}
