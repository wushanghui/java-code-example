package datastructure.sort;

import java.util.Arrays;

/**
 * @author wsh
 * @date 2020/9/22 11:36 上午
 * 冒泡排序
 */
public class BubbleSort {

    // 记录比较次数
    static int count = 0;

    public static void main(String[] args) {
//        sort();
        //System.out.println("--------");
        int[] arr = {3, 9, -1, 10, 20};
        System.out.println("排序前的数组：");
        System.out.println(Arrays.toString(arr));
        bubbleSortPlus(arr);
//        System.out.println("--------");


    }

    /**
     * 从小到大排序，拆分步骤，便于理解
     */
    private static void sort() {
        int[] arr = {4, 3, 2, 1};
        System.out.println("排序前的数组：");
        System.out.println(Arrays.toString(arr));

        int temp;
        // 第一次排序
        for (int i = 0; i < arr.length - 1 - 0; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第一次排序后的数组：");
        System.out.println(Arrays.toString(arr));
        // 第二次排序
        for (int i = 0; i < arr.length - 1 - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第二次排序后的数组：");
        System.out.println(Arrays.toString(arr));
        // 第三次排序
        for (int i = 0; i < arr.length - 1 - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第三次排序后的数组：");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序
     */
    public static void bubbleSort(int[] arr) {
        // 临时变量
        int temp;
        // 数组中含有元素的个数减1，就是需要排序的次数
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                count++;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "次排序后的数组：");
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("比较次数：" + count);
    }

    /**
     * 优化冒泡排序，减少不必要的比较
     */
    public static void bubbleSortPlus(int[] arr) {
        // 临时变量
        int temp;
        // 交换标识，默认没交换
        boolean flag = false;
        // 数组中含有元素的个数减1，就是需要排序的次数
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                count++;
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "次排序后的数组：");
            System.out.println(Arrays.toString(arr));
            if (!flag) {
                break;
            } else {
                // 重置标志，进行下次判断
                flag = false;
            }
        }
        System.out.println("比较次数：" + count);
    }
}
