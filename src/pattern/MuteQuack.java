package pattern;

/**
 * @author wsh
 * @date 2020/11/16 9:41 下午
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        // 什么都不做，不会叫
        System.out.println("很安静");
    }
}
