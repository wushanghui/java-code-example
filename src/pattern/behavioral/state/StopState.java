package pattern.behavioral.state;

/**
 * @author 吴尚慧
 * @since 2022/7/3 18:26
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("播放器处于停止状态");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "停止状态";
    }
}
