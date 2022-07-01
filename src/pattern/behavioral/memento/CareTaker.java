package pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker 对象负责从 Memento 中恢复对象的状态
 * 管理人
 *
 * @author 吴尚慧
 * @since 2022/6/30 16:23
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
