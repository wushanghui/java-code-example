package pattern.structural.decorator;

/**
 * 测试类
 *
 * @author 吴尚慧
 * @since 2022/6/26 13:18
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        Rectangle rectangle = new Rectangle();
        ShapeDecorator redRectangle = new RedShapeDecorator(rectangle);
        System.out.println("正常边框的圆");
        circle.draw();

        System.out.println("\n红色边框圆");
        redCircle.draw();

        System.out.println("\n正常边框的长方形");
        rectangle.draw();

        System.out.println("\n红色边框长方形");
        redRectangle.draw();
    }
}
