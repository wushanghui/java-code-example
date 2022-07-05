package pattern.behavioral.visitor;

/**
 * 访问者
 *
 * @author 吴尚慧
 * @since 2022/7/5 19:41
 */
public interface ComputerPartVisitor {
    /**
     * 访问
     * @param computer
     */
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
