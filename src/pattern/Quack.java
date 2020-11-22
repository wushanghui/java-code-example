package pattern;

/**
 * @author wsh
 * @date 2020/11/16 9:39 下午
 * 鸭子呱呱叫
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        // 实现鸭子呱呱叫
        System.out.println("呱呱叫");
    }
}
