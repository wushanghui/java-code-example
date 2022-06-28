package pattern.behavioral.command;

/**
 * ConcreteCommand：命令接口实现对象，是“虚”的实现；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作
 *
 * @author 吴尚慧
 * @since 2022/1/5 17:03
 */
public class BuyStock implements Order {

    private final Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
