package pattern;

/**
 * @author wsh
 * @date 2020/11/16 9:36 下午
 * 所有有翅膀的鸭子飞行行为实现类
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        // 实现鸭子飞行
        System.out.println("我会飞！！");
    }
}
