package pattern.behavioral.observer;

/**
 * 观察者测试类
 *
 * @author 吴尚慧
 * @since 2022/6/30 18:57
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
