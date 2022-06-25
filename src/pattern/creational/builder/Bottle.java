package pattern.creational.builder;

/**
 * 饮料瓶
 *
 * @author 吴尚慧
 * @since 2022/6/9 15:42
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "我是一个饮料瓶";
    }
}
