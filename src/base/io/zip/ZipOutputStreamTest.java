package base.io.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author wsh
 * @date 2021/1/6 9:58
 */
public class ZipOutputStreamTest {

    public static void main(String[] args) {

        try {
            String zipPath = "D:\\ideacode\\java-code-example\\src\\base\\io\\zip";
            String zipName = "test.zip";
            String filesPath = "D:\\ideacode\\java-code-example\\src\\base\\io\\zip\\test";
            File f = new File(filesPath);
            FileOutputStream fout = new FileOutputStream(zipPath + File.separator + zipName);
            ZipOutputStream zout = new ZipOutputStream(fout);
            if (f.isDirectory()) {
                File[] files = f.listFiles();
                for (File file : files) {
                    System.out.println(file.getAbsolutePath());
                    ZipEntry ze = new ZipEntry(file.getName());
                    zout.putNextEntry(ze);
                    FileInputStream in = new FileInputStream(file);
                    int b;
                    while ((b = in.read()) != -1) {
                        zout.write(b);
                    }
                    in.close();
                    zout.closeEntry();
                }
                zout.close();
                fout.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
