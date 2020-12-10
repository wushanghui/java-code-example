package datastructure.search;

/**
 * @author jue
 * @date 2020/12/5 21:09
 * @describe
 */
public class SeqSearch {

    public static void main(String[] args) {
        int[] arr =  {1,8, 10, 89, 1000, 1234};
        int index = seqSearch(arr, 1234);
        if (index == -1) {
            System.out.println("没有找到");
        } else {
            System.out.println("找到，下标为=" + index);
        }
    }

    /**
     * 线性查找
     * @param arr 数组
     * @param value 要查找的值
     * @return 查找的下标
     */
    public static int seqSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
