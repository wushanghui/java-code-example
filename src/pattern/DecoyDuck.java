package pattern;

/**
 * @author wsh
 * @date 2020/11/16 9:33 下午
 * 诱饵鸭（木头假鸭）
 */
public class DecoyDuck extends Duck{

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("我是一个诱饵鸭（木头假鸭）");
    }
}
