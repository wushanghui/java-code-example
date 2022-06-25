package pattern.creational.builder;

/**
 * 百事可乐
 *
 * @author 吴尚慧
 * @since 2022/6/9 15:55
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public double price() {
        return 2.0;
    }
}
