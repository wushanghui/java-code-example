package pattern;

/**
 * @author wsh
 * @date 2020/11/16 9:38 下午
 * 不会飞行鸭子的行为
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        // 什么都不做，不会飞
        System.out.println("我不会飞");
    }
}
