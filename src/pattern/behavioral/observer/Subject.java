package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 *
 * @author 吴尚慧
 * @since 2022/6/30 16:34
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        // 状态变更后通知所有的观察者
        notifyAllObservers();
    }

    /**
     * 连接
     *
     * @param observer 观察者
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 通知所有的观察者
     */
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
