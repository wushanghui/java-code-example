package pattern.behavioral.interpreter;

/**
 * 表达式
 *
 * @author 吴尚慧
 * @since 2022/6/30 10:48
 */
public interface Expression {

    /**
     * 解释
     * @param context 内容
     * @return 成功或失败
     */
    public boolean interpret(String context);

}
