package base.io.randomAccess;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * @author wsh
 * @date 2020-12-31 23:07
 */
public class DataIO {

    public static void main(String[] args) {

        String s = "AB我";
        System.out.println(s.charAt(0)+"-"+(int)s.charAt(0));
        System.out.println(s.charAt(1)+"-"+(int)s.charAt(1));
        System.out.println(s.charAt(2)+"-"+(int)s.charAt(2));
        char ch = 0;
        System.out.println(ch);

    }

    public static void writeFixedString(String s, int size, DataOutput out) throws IOException {
        for (int i = 0; i < size; i++) {
            char ch = 0;
            if (i < s.length()) {
                ch = s.charAt(i);
            }
            out.writeChar(ch);
        }
    }

    public static String readFixedString(int size, DataInput in) throws IOException {
        StringBuilder b = new StringBuilder(size);
        int i = 0;
        boolean more = true;
        while (more && i < size) {
            char ch = in.readChar();
            i++;
            if (ch == 0) {
                more = false;
            } else {
                b.append(ch);
            }

        }
        in.skipBytes(2 * (size - i));
        return b.toString();
    }
}
