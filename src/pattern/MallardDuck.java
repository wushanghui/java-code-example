package pattern;

/**
 * @author wsh
 * @date 2020/11/16 9:33 下午
 * 绿头鸭
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是一个真正的绿头鸭");
    }
}
