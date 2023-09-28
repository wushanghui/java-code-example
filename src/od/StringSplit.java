package od;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author 吴尚慧
 * @since 2022/8/3 17:03
 */
public class StringSplit {

    public static void main(String[] args) {
        // 1234d-ab-cAb-ce-@
        Scanner sc = new Scanner(System.in);
        String count = sc.nextLine();
        String str = sc.nextLine();
        String result = "";

        String[] split = str.split("-");

        result += split[0];


        String newStr = "";
        for (int i = 1; i < split.length; i++) {
            newStr += split[i];
        }
        System.out.println("newStr: " + newStr);

        int size = Integer.parseInt(count);

        for (int i = 0; i < newStr.length(); i = i + size) {
            int indexEnd = Math.min(i + size, newStr.length());
            String substring = newStr.substring(i, indexEnd);
            result += "-" + strHandle(substring);
        }
        System.out.println(result);
    }

    private static String strHandle(String str) {
        // 小写个数
        int l = 0;
        // 大写个数
        int u = 0;

        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            boolean lowerCase = Character.isLowerCase(c);
            if (lowerCase) {
                l++;
            } else {
                u++;
            }
        }
        if (l == u) {
            return str;
        } else if (l > u) {
            return str.toLowerCase();
        } else {
            return str.toUpperCase();
        }

    }
}
