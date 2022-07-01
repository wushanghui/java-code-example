package pattern.behavioral.interpreter;

/**
 * 终端
 *
 * @author 吴尚慧
 * @since 2022/6/30 10:49
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
