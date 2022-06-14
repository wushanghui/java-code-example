package pattern.creational.factory.abstractFactory;

/**
 * 红色
 *
 * @author 吴尚慧
 * @since 2022/6/13 11:40
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("我是一个红色");
    }
}
