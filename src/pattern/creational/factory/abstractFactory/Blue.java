package pattern.creational.factory.abstractFactory;

/**
 * 蓝色
 *
 * @author 吴尚慧
 * @since 2022/6/13 11:44
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("我是一个蓝色");
    }
}
