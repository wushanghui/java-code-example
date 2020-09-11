package datastructure.stack;

/**
 * @author wsh
 * @date 2020/9/8 3:31 下午
 */
public class Calculator {

    public static void main(String[] args) {
        String expression = "20+3*5-10";
        // 数栈
        ArrayStack2 numStack = new ArrayStack2(10);
        // 符号栈
        ArrayStack2 operStack = new ArrayStack2(10);

        // 需要用到的一些变量
        // 扫描的下标
        int index = 0;
        int num1;
        int num2;
        int oper;
        int res;
        // 记录每次扫描的结果
        char ch;
        // 用与拼接多位数
        String numStr = "";
        // 表达式扫描
        while (true) {
            ch = expression.substring(index, index + 1).charAt(0);

            if (operStack.isOper(ch)) {
                // 运算符
                if (!operStack.isEmpty()) {
                    // 符号栈中有运算符，比较优先级，优先级高的先计算
                    if (operStack.priority(ch) <= operStack.priority(operStack.peek())) {
                        // 符号栈中的运算符优先级比当前的运算符优先级高
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = numStack.cal(num1, num2, oper);
                        // 运算结果压入数栈
                        numStack.push(res);
                        operStack.push(ch);
                    } else {
                        // 符号栈中的运算符优先级比当前的运算符优先级低，直接把当前运算符压入栈
                        operStack.push(ch);
                    }
                } else {
                    // 如果符号栈为空，直接入栈
                    operStack.push(ch);
                }
            } else {
                // 如果是数, 可能是多位数哦
                numStr += ch;
                if (index == expression.length() - 1) {
                    numStack.push(Integer.parseInt(numStr));
                } else {
                    if (operStack.isOper(expression.substring(index + 1, index + 2).charAt(0))) {
                        numStack.push(Integer.parseInt(numStr));
                        // 清空多位数收集的字符串，方便下次使用
                        numStr = "";
                    }
                }

            }
            index++;
            if (index >= expression.length()) {
                break;
            }
        }

        // 扫描后，从数栈和符号栈中 pop出相应的数值和符号，根据出栈顺序进行运算
        while (true) {
            if (operStack.isEmpty()) {
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = numStack.cal(num1, num2, oper);
            numStack.push(res);
        }
        int res2 = numStack.pop();
        System.out.printf("表达式: %s=%d", expression, res2);
    }
}

class ArrayStack2 {
    /**
     * 栈大小
     */
    private int maxSize;
    /**
     * 数组模拟栈
     */
    private int[] stack;
    /**
     * 栈顶指针
     */
    private int top = -1;

    public ArrayStack2(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    /**
     * 判断是否栈满
     */
    public boolean isFull() {
        return top == maxSize - 1;
    }

    /**
     * 判断栈是否空
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 入栈
     *
     * @param value val
     */
    public void push(int value) {
        if (isFull()) {
            System.out.println("栈满~~");
            return;
        }
        stack[++top] = value;
    }

    /**
     * 出栈
     *
     * @return 栈顶的值
     */
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈空~~");
        }
        return stack[top--];
    }

    /**
     * 显示栈（从栈顶开始）
     */
    public void list() {
        if (isEmpty()) {
            System.out.println("栈空~~");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d]=%d\n", i, stack[i]);
        }
    }

    /**
     * 查看栈顶的值，不出栈
     */
    public int peek() {
        return stack[top];
    }

    /**
     * 返回运算符的优先级，数字越大，优先级越高（只支持 + - * /）
     *
     * @param oper 运算符
     * @return 优先级
     */
    public int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * 判断是否是运算符
     */
    public boolean isOper(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    /**
     * 计算
     */
    public int cal(int num1, int num2, int oper) {
        int res = 0;
        switch (oper) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                break;
        }
        return res;
    }
}
