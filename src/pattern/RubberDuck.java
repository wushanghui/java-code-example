package pattern;

/**
 * @author wsh
 * @date 2020/11/16 9:33 下午
 * 橡皮鸭
 */
public class RubberDuck extends Duck{

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("我是一个橡皮鸭");
    }
}
