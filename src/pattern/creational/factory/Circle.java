package pattern.creational.factory;

/**
 * 圆
 *
 * @author 吴尚慧
 * @since 2022/6/13 10:22
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}
