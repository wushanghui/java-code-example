package base.io;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.PushbackInputStream;

/**
 * @author wsh
 * @date 2020/12/29 10:32
 */
public class FilterDemo {

    public static void main(String[] args) {
        try {
//            FileInputStream fin = new FileInputStream("D:\\ideacode\\java-code-example\\src\\base\\io\\employee.dat");
            FileInputStream fin = new FileInputStream("D:\\ideacode\\java-code-example\\src\\base\\io\\employee.txt");
            DataInputStream din = new DataInputStream(fin);
//            double d = din.readDouble();
            String s = din.readUTF();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() throws Exception {
        PushbackInputStream stream = new PushbackInputStream(new BufferedInputStream(new FileInputStream("D:\\ideacode\\java-code-example\\src\\base\\io\\employee.txt")));
        int b = stream.read();
        if (b != '1') {
            System.out.println("unread~~~");
            stream.unread(b);
        } else {
            System.out.println("read~~~");
        }
    }

    @Test
    public void test2() throws Exception {
        PrintWriter out = new PrintWriter("D:\\ideacode\\java-code-example\\src\\base\\io\\employee2.txt", "UTF-8");
        String name = "Tom";
        double salary = 10000;
        out.print(name);
        out.print(' ');
        out.println(salary);
        boolean b = out.checkError();
        System.out.println(b);
    }
}
