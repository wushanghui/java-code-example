package pattern.creational.prototype;

/**
 * 圆
 *
 * @author 吴尚慧
 * @since 2022/6/21 10:17
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}
