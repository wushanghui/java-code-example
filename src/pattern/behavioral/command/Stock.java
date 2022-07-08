package pattern.behavioral.command;

/**
 * 股票
 *
 * @author 吴尚慧
 * @since 2022/1/5 16:59
 */
public class Stock {

    private String name = "ABC";

    /**
     * 数量
     */
    private int quantity = 10;

    /**
     * 购买
     */
    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }

    /**
     * 出售
     */
    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }
}
