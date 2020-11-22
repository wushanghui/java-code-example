package pattern;

/**
 * @author wsh
 * @date 2020/11/17 10:37 下午
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("利用火箭动力去飞");
    }
}
