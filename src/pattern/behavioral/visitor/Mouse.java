package pattern.behavioral.visitor;

/**
 * 鼠标
 *
 * @author 吴尚慧
 * @since 2022/7/5 19:42
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
