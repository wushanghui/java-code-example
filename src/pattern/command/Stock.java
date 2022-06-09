package pattern.command;

/**
 * 库存(接受者)
 * Receiver
 * 接收者，真正执行命令的对象。任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能。
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
