package base.io.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author wsh
 * @date 2021/1/6 9:57
 */
public class ZipInputStreamTest {

    public static void main(String[] args) {
        String zipPath = "D:\\ideacode\\java-code-example\\src\\base\\io\\zip\\test.zip";
        String parent = "D:\\ideacode\\java-code-example\\src\\base\\io\\zip\\test2";
        try {
            ZipInputStream zin = new ZipInputStream(new FileInputStream(zipPath));
            ZipEntry ze;
            File file;
            while ((ze = zin.getNextEntry()) != null && !ze.isDirectory()) {
                file = new File(parent, ze.getName());
                if (!file.exists()) {
                    file.getParentFile().mkdirs();
                }
                FileOutputStream fout = new FileOutputStream(file);
                int b;
                while ((b = zin.read()) != -1) {
                    fout.write(b);
                }
                fout.close();
                zin.closeEntry();
                System.out.println(ze.getName() + "解压成功！");
            }
            zin.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
