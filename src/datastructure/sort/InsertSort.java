package datastructure.sort;

import java.util.Arrays;

/**
 * @author wsh
 * @date 2020/9/22 5:40 下午
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        //sort();
        int[] arr = {2, 1, 6, -1};
        insertSort(arr);
    }

    /**
     * 插入排序
     */
    public static void insertSort(int[] arr) {
        System.out.println("排序之前的数组：");
        System.out.println(Arrays.toString(arr));
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
            System.out.println("第" + i + "轮插入后：");
            System.out.println(Arrays.toString(arr));
        }
    }

    /**
     * 插入排序 分步推导
     */
    public static void sort() {
        int[] arr = {2, 1, 6, -1};
        System.out.println("排序之前的数组：");
        System.out.println(Arrays.toString(arr));

        // 第1轮
        // 待插入的数
        int insertVal = arr[1];
        int insertIndex = 1 - 1;
        while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
            arr[insertIndex + 1] = arr[insertIndex];
            insertIndex--;
        }
        arr[insertIndex + 1] = insertVal;
        System.out.println("第1轮插入后：");
        System.out.println(Arrays.toString(arr));

        // 第2轮
        insertVal = arr[2];
        insertIndex = 2 - 1;
        while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
            arr[insertIndex + 1] = arr[insertIndex];
            insertIndex--;
        }
        arr[insertIndex + 1] = insertVal;
        System.out.println("第2轮插入后：");
        System.out.println(Arrays.toString(arr));

        // 第3轮
        insertVal = arr[3];
        insertIndex = 3 - 1;
        while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
            arr[insertIndex + 1] = arr[insertIndex];
            insertIndex--;
        }
        arr[insertIndex + 1] = insertVal;
        System.out.println("第3轮插入后：");
        System.out.println(Arrays.toString(arr));
    }
}
