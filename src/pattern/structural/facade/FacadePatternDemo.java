package pattern.structural.facade;

/**
 * 测试类
 *
 * @author 吴尚慧
 * @since 2022/6/26 17:05
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
