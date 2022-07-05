package pattern.behavioral.state;

/**
 * 状态模式
 *
 * @author 吴尚慧
 * @since 2022/7/3 18:26
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}