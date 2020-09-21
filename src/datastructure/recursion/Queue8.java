package datastructure.recursion;

import java.io.PipedReader;

/**
 * @author wsh
 * @date 2020/9/21 2:19 下午
 * 8皇后问题
 */
public class Queue8 {

    private int max = 8;
    // 定义数组 array, 保存皇后放置位置的结果,比如 arr = {0 , 4, 7, 5, 2, 6, 1, 3}
    private int[] array = new int[max];

    private static int count = 0;

    private static int judgeCount = 0;

    public static void main(String[] args) {
        Queue8 queue8 = new Queue8();
        queue8.check(0);
        System.out.printf("一共有%d解法", count);
        System.out.println("判断冲突的次数：" + judgeCount);
    }

    /**
     * 放第 n 个皇后
     * check 是 每一次递归时，进入到 check 中都有 for(int i = 0; i < max; i++)，因此会有回溯
     * @param n
     */
    private void check(int n) {
        if (n == 8) {
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            array[n] = i;
            if (judge(n)) {
                check(n + 1);
            }
        }

    }

    /**
     * 判断放置的第n个皇后，是否和前面已摆放的皇后是否冲突
     *
     * @param n 第n个皇后
     * @return false 冲突，true 不冲突
     */
    private boolean judge(int n) {
        judgeCount++;
        /*
            array[i] == array[n] 表示判断 第 n 个皇后是否和前面的 n-1 个皇后在同一列
            Math.abs(n-i) == Math.abs(array[n] - array[i]) 表示判断第 n 个皇后是否和第 i 皇后是否在同一斜线
            判断是否在同一行, 没有必要，n 每次都在递增
        */
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }


    private void print() {
        count++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
