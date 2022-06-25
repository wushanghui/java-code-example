package pattern.creational.builder;

/**
 * 素食汉堡
 *
 * @author 吴尚慧
 * @since 2022/6/9 15:52
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "素食汉堡";
    }

    @Override
    public double price() {
        return 10.0;
    }
}
