package pattern.structural.bridge;

/**
 * 测试类
 *
 * @author 吴尚慧
 * @since 2022/6/25 18:12
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
