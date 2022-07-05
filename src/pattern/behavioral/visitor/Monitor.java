package pattern.behavioral.visitor;

/**
 * @author 吴尚慧
 * @since 2022/7/5 19:42
 */
public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
