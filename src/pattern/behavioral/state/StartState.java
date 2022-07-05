package pattern.behavioral.state;

/**
 * @author 吴尚慧
 * @since 2022/7/3 18:24
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("播放器处于启动状态");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "开始状态";
    }
}
