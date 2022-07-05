package pattern.behavioral.strategy;

/**
 * @author 吴尚慧
 * @since 2022/7/5 12:51
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
