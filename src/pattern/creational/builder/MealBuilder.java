package pattern.creational.builder;

/**
 * 套餐创建者
 *
 * @author 吴尚慧
 * @since 2022/6/9 16:02
 */
public class MealBuilder {

    /**
     * 准备素食餐食
     *
     * @return 一顿饭
     */
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 准备非素食餐食
     *
     * @return 一顿饭
     */
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
