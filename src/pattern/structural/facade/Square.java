package pattern.structural.facade;

/**
 * 正方形
 *
 * @author 吴尚慧
 * @since 2022/6/13 10:22
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("形状：正方形");
    }
}
