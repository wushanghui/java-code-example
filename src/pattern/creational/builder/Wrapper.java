package pattern.creational.builder;

/**
 * 包装纸
 *
 * @author 吴尚慧
 * @since 2022/6/9 15:40
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "我是食物的包装纸";
    }
}
