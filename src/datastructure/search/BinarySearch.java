package datastructure.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wsh
 * @date 2020/12/8 17:14
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 8, 10, 89, 1000, 1000, 1234};
//        int index = binarySearch(arr, 0, arr.length - 1, 1234);
//        if (index != -1) {
//            System.out.println("找到的下标：" + index);
//        } else {
//            System.out.println("没有找到");
//        }
        System.out.println("----------------");
        List<Integer> indexList = binarySearch2(arr, 0, arr.length - 1, 1000);
        System.out.println(indexList);
    }

    /**
     * 二分查找
     *
     * @param arr     数组
     * @param left    左边界下标
     * @param right   右边界下标
     * @param findVal 要查找的值
     * @return 返回要查找的值所在数组的小标，找不到返回 -1
     */
    public static int binarySearch(int[] arr, int left, int right, int findVal) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if (findVal > midVal) {
            // 向右 递归
            return binarySearch(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            // 向左递归
            return binarySearch(arr, left, mid - 1, findVal);
        } else {
            return mid;
        }
    }

    public static List<Integer> binarySearch2(int[] arr, int left, int right, int findVal) {
        List<Integer> indexList;
        if (left > right) {
            indexList = new ArrayList<>();
            return indexList;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if (findVal > midVal) {
            // 向右 递归
            return binarySearch2(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            // 向左递归
            return binarySearch2(arr, left, mid - 1, findVal);
        } else {
            indexList = new ArrayList<>();
            // 先向左扫描
            int temp = mid - 1;
            while (true) {
                if (temp < 0 || arr[temp] != findVal) {
                    break;
                }
                indexList.add(temp);
                // 左移
                temp -= 1;
            }

            indexList.add(mid);

            // 再向右扫描
            temp = mid + 1;
            while (true) {
                if (temp > arr.length - 1 || arr[temp] != findVal) {
                    break;
                }
                indexList.add(temp);
                // 右移
                temp += 1;
            }
        }
        return indexList;
    }
}
