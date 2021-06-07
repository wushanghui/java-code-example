package base.io.file;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author wsh
 * @date 2021-01-12 22:47
 */
public class PathTest2 {

    public static void main(String[] args) throws IOException {
        Path base = Paths.get("/Users/wushanghui/Desktop");
        Path path1 = base.resolve("a/1");
        Path bPath = base.resolve("b");
        bPath.forEach(System.out::println);
       Files.lines(path1).forEach(System.out::println);
//        if (!Files.exists(path1)) {
//            Files.createDirectories(path1);
//        } else {
//            Files.createFile(path1.resolve("111.txt"));
//            Files.createFile(path1.resolve("222.txt"));
//        }
//        if (!Files.exists(bPath)) {
//            Files.createDirectories(bPath);
//        }

    }
}
