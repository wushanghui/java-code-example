package datastructure.sort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jue
 * @date 2020/12/1 22:58
 * @describe
 */
public class RadixSort {

    public static void main(String[] args) {
        int[] arr = {53, 3, 542, 748, 14, 214};
        System.out.println(Arrays.toString(arr));
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int[] arr) {
        // 先找出来最大数是多少
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 数组中最大数的位数
        int maxLength = String.valueOf(max).length();

        // 二维数组表示 10个桶（0-9一共10个桶），每个桶是一个一维数组
        int[][] bucket = new int[10][arr.length];
        // bucketElementCounts 记录的是每个桶中放置的数据的个数, 比如3号桶的个数 bucketElementCounts[3] 刚开始是0 ，
        // 如果3号桶中存了一个数，bucketElementCounts[3]++ ，bucketElementCounts[3]就等于1了，所以表示个数
        int[] bucketElementCounts = new int[10];

        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int digitOfElement = arr[j] / n % 10;
                // 放入桶中
                bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
                bucketElementCounts[digitOfElement]++;
            }

            // 按照桶的顺序（一维数组的下标依次取出数据，放入原来数组）
            int index = 0;
            // 遍历每一个桶，将桶中的数据放入原来数组
            for (int k = 0; k < bucketElementCounts.length; k++) {
                // 桶中有数据，才放入原数组
                if (bucketElementCounts[k] != 0) {
                    for (int l = 0; l < bucketElementCounts[k]; l++) {
                        arr[index++] = bucket[k][l];
                    }
                }
                bucketElementCounts[k] = 0;
            }

        }
    }
}