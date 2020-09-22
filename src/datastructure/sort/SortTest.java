package datastructure.sort;

/**
 * @author wsh
 * @date 2020/9/21 17:25
 */
public class SortTest {

    public static void main(String[] args) {
        int total = 0;
        int start = 1;
        int end = 100;
        // 算法1
        for (int i = start; i <= end; i++) {
            total += i;
        }
        System.out.println("算法1：" + total);

        // 算法2
        total = (start + end) * end / 2;
        System.out.println("算法2：" + total);
        int n = 100;


//        for (int i = 1; i <= n; i++) {
//            int j = 1;
//            while (j < n) {
//                j = j * 2;
//            }
//        }


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
