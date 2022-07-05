package pattern.behavioral.visitor;

/**
 * @author 吴尚慧
 * @since 2022/7/5 17:26
 */
public interface ComputerPart {

    /**
     * 接受访问
     *
     * @param computerPartVisitor 访问者
     */
    void accept(ComputerPartVisitor computerPartVisitor);

}
