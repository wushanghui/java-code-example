package pattern.behavioral.memento;

/**
 * Originator 创建并在 Memento 对象中存储状态
 *
 * @author 吴尚慧
 * @since 2022/6/30 16:22
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento) {
        this.state = Memento.getState();
    }
}
