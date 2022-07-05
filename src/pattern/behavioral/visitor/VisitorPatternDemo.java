package pattern.behavioral.visitor;

/**
 * 访问者模式
 *
 * @author 吴尚慧
 * @since 2022/7/5 19:59
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
