package base.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author wsh
 * @date 2020-12-29 22:27
 */
public class ZipDemo {

    public static void main(String[] args) throws IOException {

        ZipInputStream zin = new ZipInputStream(new FileInputStream("/Users/wushanghui/IdeaProjects/java-code-example/src/base/io/test.zip"));
        ZipEntry entry;
        while ((entry = zin.getNextEntry()) != null) {
            System.out.println(entry.getName());
        }
    }
}
