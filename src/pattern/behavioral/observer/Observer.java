package pattern.behavioral.observer;

/**
 * 观察者
 *
 * @author 吴尚慧
 * @since 2022/6/30 16:35
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
