package pattern.structural.facade;

/**
 * 外观类
 *
 * @author 吴尚慧
 * @since 2022/6/26 17:03
 */
public class ShapeMaker {

    /**
     * 圆
     */
    private Shape circle;
    /**
     * 长方形
     */
    private Shape rectangle;
    /**
     * 正方形
     */
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
