package base.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static base.interfaces.InterfaceExample.x;

/**
 * @author wsh
 * @date 2020/11/27 10:25 下午
 */
public class FileStream {

    public static void main(String[] args) throws IOException {
        // a-97
        //b-98
        //c-99
        //d-100
        // FileInputStream 只支持在字节级别上的读
        FileInputStream fileInputStream = new FileInputStream("/Users/wushanghui/IdeaProjects/java-code-example/src/base/io/test.txt");
        int read = fileInputStream.read();
        System.out.println(read);
        int read2 = fileInputStream.read();
        System.out.println(read2);
        fileInputStream.close();

        // 怎么从文件中读入数字
        FileInputStream fin = new FileInputStream("/Users/wushanghui/IdeaProjects/java-code-example/src/base/io/double.txt");
        DataInputStream din = new DataInputStream(fin);
        int read1 = din.read();
        System.out.println(read1);
        fin.close();
        din.close();

    }
}
