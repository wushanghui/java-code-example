package pattern.structural.facade;

/**
 * 长方形
 *
 * @author 吴尚慧
 * @since 2022/6/13 10:22
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("形状：长方形");
    }
}
