package od;

import java.util.Scanner;

/**
 * 分班排队问题
 *
 * @author 吴尚慧
 * @since 2022/8/3 13:44
 */
public class ClassTest {

    public static void main(String[] args) {
        // 1/N 2/Y 3/N 4/Y
//        Scanner scanner = new Scanner(System.in);
//        String content = scanner.nextLine();
        String content = "1/N 2/Y 3/Y 4/Y 5/Y 6/N";
        String[] students = content.split(" ");

        String class1 = "";
        String class2 = "";
        boolean flag = true;
        for (int i = 0; i < students.length; i++) {
            // flag true N 为一班，false N 为二班
            String student = students[i];
            String[] split = student.split("/");
            String studentNum = split[0];
            String controlFlag = split[1];
            if (flag) {
                // N 为 一班
                if ("N".equals(controlFlag)) {
                    class1 += studentNum + " ";
                    flag = !flag;
                } else {
                    class2 += studentNum + " ";
                }
            } else {
                if ("N".equals(controlFlag)) {
                    class2 += studentNum + " ";
                    flag = !flag;
                } else {
                    class1 += studentNum + " ";
                }
            }
        }

        System.out.println("class1 = " + class1);
        System.out.println("class2 = " + class2);
    }
}
