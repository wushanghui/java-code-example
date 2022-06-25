package pattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 套餐，一顿饭
 *
 * @author 吴尚慧
 * @since 2022/6/9 15:57
 */
public class Meal {

    /**
     * 食物清单
     */
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 花费
     *
     * @return 花费
     */
    public double getCost() {
        double cost = 0.0;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * 显示清单列表
     */
    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
