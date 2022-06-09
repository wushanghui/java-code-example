package pattern.creational.builder;

/**
 * 冷饮
 *
 * @author 吴尚慧
 * @since 2022/6/9 15:50
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract double price();
}
