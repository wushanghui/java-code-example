package pattern.creational.builder;

/**
 * 可口可乐
 *
 * @author 吴尚慧
 * @since 2022/6/9 15:55
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public double price() {
        return 3.0;
    }
}
