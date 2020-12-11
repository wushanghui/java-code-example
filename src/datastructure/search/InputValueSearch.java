package datastructure.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wsh
 * @date 2020/12/8 17:14
 */
public class InputValueSearch {

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        // System.out.println(Arrays.toString(arr));
        int index = inputValueSearch(arr, 0, arr.length - 1, 100);
        System.out.println("index=" + index);
    }

    /**
     * 插值查找
     *
     * @param arr     数组
     * @param left    左边界下标
     * @param right   右边界下标
     * @param findVal 要查找的值
     * @return 返回要查找的值所在数组的小标，找不到返回 -1
     */
    public static int inputValueSearch(int[] arr, int left, int right, int findVal) {
        System.out.println("插值算法查找次数~~~");
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) * (findVal - arr[left]) / (arr[right] - arr[left]);
        int midVal = arr[mid];

        if (findVal > midVal) {
            // 向右 递归
            return inputValueSearch(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            // 向左递归
            return inputValueSearch(arr, left, mid - 1, findVal);
        } else {
            return mid;
        }
    }

}
