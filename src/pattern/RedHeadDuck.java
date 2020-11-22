package pattern;

/**
 * @author wsh
 * @date 2020/11/16 9:33 下午
 * 红头鸭
 */
public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是一个真正的红头鸭");
    }
}
