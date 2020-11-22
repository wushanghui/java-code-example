package pattern;

/**
 * @author wsh
 * @date 2020/11/16 9:40 下午
 * 鸭子吱吱叫
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        // 橡皮鸭子吱吱叫
        System.out.println("吱吱叫");
    }
}
