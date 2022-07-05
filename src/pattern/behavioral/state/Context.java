package pattern.behavioral.state;

/**
 * @author 吴尚慧
 * @since 2022/7/3 18:24
 */
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
