package pattern.behavioral.command;

/**
 * 售卖股票
 *
 * @author 吴尚慧
 * @since 2022/1/5 17:04
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
