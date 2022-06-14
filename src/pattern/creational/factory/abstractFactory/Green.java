package pattern.creational.factory.abstractFactory;

/**
 * 绿色
 *
 * @author 吴尚慧
 * @since 2022/6/13 11:44
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("我是一个绿色");
    }
}
