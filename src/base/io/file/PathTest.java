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

/**
 * @author wsh
 * @date 2021-01-12 22:47
 */
public class PathTest {

    public static void main(String[] args) throws IOException {
        // Paths.get()
        // 1、创建路径
        // 绝对路径
        Path absolute = Paths.get("/Users/wushanghui/Downloads", "java");
        System.out.println("创建的绝对路径：" + absolute);
        // 相对路径
        Path relative = Paths.get("myDirectory", "java", "user.properties");
        System.out.println("创建的相对路径：" + relative);

        System.out.println();

        // 2、Path
        // 2.1 绝对路径
        Path basePath = Paths.get("/Users/wushanghui/IdeaProjects/java-code-example/src/base/io");
        Path aPath = Paths.get("file", "a.txt");
        // 拼接成绝对路径
        Path aResolvePath = basePath.resolve(aPath);
        System.out.println("文件a的绝对路径：" + aResolvePath);

        Path bResolvePath = basePath.resolve("file/b.txt");
        System.out.println("文件b的绝对路径：" + bResolvePath);

        // resolveSibling(Path other) other是相对路径，它会替换basePath一层路径
        Path cPath = Paths.get("file/c.txt");
        Path cResolvePath = basePath.resolveSibling(cPath);
        System.out.println("文件c的绝对路径：" + cResolvePath);

        Path dResolvePath = basePath.resolveSibling("file/d.txt");
        System.out.println("文件d的绝对路径：" + dResolvePath);

        Path eResolvePath = basePath.resolveSibling("/file/e.txt");
        System.out.println("文件e的绝对路径：" + eResolvePath);

        System.out.println();

        Path basePath2 = Paths.get("/Users/wushanghui/IdeaProjects/java-code-example/src/base");

        Path relativize = basePath2.relativize(basePath);
        System.out.println("basePath2相对于basePath的相对路径：" + relativize);
        System.out.println("反过来：" + basePath.relativize(basePath2));

        System.out.println();

        // 解析 .和.. 路径
        System.out.println(Paths.get("/Users/wushanghui/IdeaProjects/java-code-example/src/base").normalize());
        System.out.println(Paths.get("/Users/wushanghui/IdeaProjects/java-code-example/src/base/.").normalize());
        System.out.println(Paths.get("/Users/wushanghui/IdeaProjects/java-code-example/src/base/..").normalize());

        System.out.println();

        System.out.println(Paths.get("f.txt").toAbsolutePath());

        System.out.println(basePath + " parent: " + basePath.getParent());
        System.out.println(basePath + " fileName: " + basePath.getFileName());
        System.out.println(basePath.getRoot());

        File aFile = aResolvePath.toFile();
        System.out.println(aFile);
        Path aPath2 = aFile.toPath();
        System.out.println(aPath2);

        // 3、Files
        // 3.1 读写文件
        byte[] allBytes = Files.readAllBytes(aResolvePath);
        String aStr = new String(allBytes, StandardCharsets.UTF_8);
        System.out.println(aStr);

        List<String> aStrList = Files.readAllLines(aResolvePath, StandardCharsets.UTF_8);
        aStrList.forEach(System.out::println);

        // 向文件中写入内容
        // 适合中等长度的文本文件
        // 替换文件中内容
        //Files.write(aResolvePath, "台湾是中国不可分割的一部分".getBytes(StandardCharsets.UTF_8));
        // 追加内容
        Files.write(aResolvePath, "\n台湾是中国不可分割的一部分".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

        // 文件长度较大的使用流的方式，如下：
        try (InputStream in = Files.newInputStream(aResolvePath);
             OutputStream out = Files.newOutputStream(bResolvePath)) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
        Path fPath = Paths.get("/Users/wushanghui/IdeaProjects/java-code-example/src/base/io/file/f.txt");
        try (Reader r = Files.newBufferedReader(aResolvePath, StandardCharsets.UTF_8);
             Writer w = Files.newBufferedWriter(fPath, StandardCharsets.UTF_8)) {
            int b;
            while ((b = r.read()) != -1) {
                w.write(b);
            }
        }

        // 3.2 创建文件和目录
        // 3.2.1 创建目录
        //Path dirPath = Paths.get("/Users/wushanghui/IdeaProjects/java-code-example/src/base/io/file/aDirectory");
        // 只能创建一次，只能创建一层目录
        //Files.createDirectory(dirPath);
        Path dirPath2 = Paths.get("/Users/wushanghui/IdeaProjects/java-code-example/src/base/io/file/bDirectory/b");
        // 可以创建多级目录，可以多次重复创建
        Files.createDirectories(dirPath2);

        // 3.2.2 创建文件




    }
}
