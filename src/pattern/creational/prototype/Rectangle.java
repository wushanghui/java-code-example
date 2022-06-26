package pattern.creational.prototype;

/**
 * 长方形
 *
 * @author 吴尚慧
 * @since 2022/6/21 10:17
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("画一个长方形");
    }
}
