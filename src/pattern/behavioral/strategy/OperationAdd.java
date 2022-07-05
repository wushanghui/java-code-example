package pattern.behavioral.strategy;

/**
 * @author 吴尚慧
 * @since 2022/7/3 19:05
 */
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
