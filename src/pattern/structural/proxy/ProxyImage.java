package pattern.structural.proxy;

/**
 * @author 吴尚慧
 * @since 2022/6/26 21:05
 */
public class ProxyImage implements Image {

    /**
     * 真实对象
     */
    private RealImage realImage;
    /**
     * 文件名
     */
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
