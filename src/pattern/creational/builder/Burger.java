package pattern.creational.builder;

/**
 * 汉堡包
 *
 * @author 吴尚慧
 * @since 2022/6/9 15:47
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    /**
     * 价格
     *
     * @return
     */
    @Override
    public abstract double price();
}
