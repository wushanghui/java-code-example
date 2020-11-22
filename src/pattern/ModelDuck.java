package pattern;

/**
 * @author wsh
 * @date 2020/11/17 10:35 下午
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是一只模型鸭");
    }
}
