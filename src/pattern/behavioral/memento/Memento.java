package pattern.behavioral.memento;

/**
 * 备忘录
 *
 * @author 吴尚慧
 * @since 2022/6/30 16:21
 */
public class Memento {

    /**
     * 状态
     */
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
