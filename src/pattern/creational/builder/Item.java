package pattern.creational.builder;

/**
 * 食物条目
 *
 * @author 吴尚慧
 * @since 2022/6/9 15:39
 */
public interface Item {
    public String name();
    public Packing packing();
    public double price();
}
