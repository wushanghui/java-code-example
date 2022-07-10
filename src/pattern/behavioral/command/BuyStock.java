package pattern.behavioral.command;

/**
 * 购买股票
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
