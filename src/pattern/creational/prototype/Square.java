package pattern.creational.prototype;

/**
 * 正方形
 *
 * @author 吴尚慧
 * @since 2022/6/21 10:17
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }
}
