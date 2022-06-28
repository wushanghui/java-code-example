package pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用类(调用者)
 * Invoker
 * 要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口。
 *
 * @author 吴尚慧
 * @since 2022/1/5 17:04
 */
public class Broker {

    private final List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
