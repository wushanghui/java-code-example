package pattern.behavioral.command;

/**
 * @author 吴尚慧
 * @since 2022/1/5 17:08
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        // 命令的接收者Receiver
        Stock abcStock = new Stock();

        // 购买命令
        BuyStock buyStockOrder = new BuyStock(abcStock);
        // 出售命令
        SellStock sellStockOrder = new SellStock(abcStock);
        // Client
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
