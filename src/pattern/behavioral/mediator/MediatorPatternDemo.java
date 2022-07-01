package pattern.behavioral.mediator;

/**
 * @author 吴尚慧
 * @since 2022/6/30 16:19
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
