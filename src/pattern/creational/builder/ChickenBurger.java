package pattern.creational.builder;

/**
 * 鸡肉汉堡
 *
 * @author 吴尚慧
 * @since 2022/6/9 15:53
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public double price() {
        return 20.0;
    }
}
