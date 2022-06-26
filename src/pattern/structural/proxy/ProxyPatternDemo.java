package pattern.structural.proxy;

/**
 * @author 吴尚慧
 * @since 2022/6/26 21:07
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_01.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
    }
}
