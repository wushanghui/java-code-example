package datastructure.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author wsh
 * @date 2020/9/11 11:11 上午
 */
public class PolandNotation {

    public static void main(String[] args) {
//        String suffixExpression = "3 4 + 5 * 6 -";
//        String[] array = suffixExpression.split(" ");
//        List<String> list = arrayToList(array);
//        int res = calculate(list);
//        System.out.println("计算结果：" + res);

        String infixExpression = "10+((2+3)*4)-5";
        System.out.println("中缀表达式为："+infixExpression);
        List<String> infixExpressionList = getInfixExpressionList(infixExpression);
        System.out.println("中缀表达式转化成list："+infixExpressionList);
        List<String> suffixExpressionList = parseSuffixExpressionList(infixExpressionList);
        System.out.println("后缀表达式list："+suffixExpressionList);
        int calculate = calculate(suffixExpressionList);
        System.out.println("计算结果：10+((2+3)*4)-5="+calculate);
    }

    public static List<String> arrayToList(String[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static int calculate(List<String> list) {
        Stack<String> stack = new Stack<>();
        list.forEach(item -> {
            if (item.matches("\\d+")) {
                // 数直接入栈
                stack.push(item);
            } else {
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                int res = 0;
                if (item.equals("+")) {
                    res = num2 + num1;
                } else if (item.equals("-")) {
                    res = num2 - num1;
                } else if (item.equals("*")) {
                    res = num2 * num1;
                } else if (item.equals("/")) {
                    res = num2 / num1;
                } else {
                    throw new RuntimeException("运算符错误");
                }
                stack.push(String.valueOf(res));
            }
        });
        return Integer.parseInt(stack.pop());
    }

    /**
     * 中缀表达式转后缀表达式
     * @param infixList 中缀表达式list
     * @return 后缀表达式list
     */
    public static List<String> parseSuffixExpressionList(List<String> infixList) {
        // 符号栈
        Stack<String> s1 = new Stack<>();
        // 中间结果栈
        Stack<String> s2 = new Stack<>();
        // 从左至右扫描中缀表达式
        infixList.forEach(item -> {
            if (item.matches("\\d+")) {
                // 遇到操作数时，将其压s2
                s2.push(item);
            } else if (item.equals("(")) {
                // 如果是左括号“(”，则直接压入s1
                s1.push(item);
            } else if (item.equals(")")) {
                // 如果是右括号“)”，则依次弹出s1栈顶的运算符，并压入s2，直到遇到左括号为止，此时将这一对括号丢弃
                while (!s1.peek().equals("(")) {
                    s2.push(s1.pop());
                }
                // "(" 从s1栈中弹出，消除括号
                s1.pop();
            } else {
                // 遇到运算符时，比较其与s1栈顶运算符的优先级：
                //如果s1为空，或栈顶运算符为左括号“(”，则直接将此运算符入栈；
                //否则，若优先级比栈顶运算符的高，也将运算符压入s1；
                //否则，将s1栈顶的运算符弹出并压入到s2中，再次重新与s1中新的栈顶运算符相比较；
                while (s1.size() != 0 && Operation.getValue(item) <= Operation.getValue(s1.peek())) {
                    s2.push(s1.pop());
                }
                s1.push(item);
            }
        });
        // 将s1 符号栈中剩余的运算符弹出后压入s2
        while (s1.size() != 0) {
            s2.push(s1.pop());
        }
        // 逆序打印s2，把结果加入list中
        Stack<String> tempStack = new Stack<>();
        s2.forEach(tempStack::push);
        return new ArrayList<>(tempStack);
    }

    /**
     * 扫描中缀表达式，转化成list
     * @param infixStr 中缀表达式
     */
    public static List<String> getInfixExpressionList(String infixStr) {
        List<String> list = new ArrayList<>();
        int index = 0;
        String str;
        while (index < infixStr.length()) {
            // 不是数 ascll 码 48 - 57 表示 数字 0-9
            if (infixStr.charAt(index) < 48 || infixStr.charAt(index) > 57) {
                list.add(String.valueOf(infixStr.charAt(index)));
                index++;
            } else {
                // 是一个数
                str = "";
                while (index < infixStr.length() && infixStr.charAt(index) >= 48 && infixStr.charAt(index) <= 57) {
                    str += infixStr.charAt(index);
                    index++;
                }
                list.add(str);
            }
        }
        return list;
    }
}

class Operation {
    private static final int ADD = 1;
    private static final int SUB = 1;
    private static final int MUL = 2;
    private static final int DIV = 2;

    /**
     * 返回优先级，数字越大，优先级越高
     */
    public static int getValue(String operation) {
        int val = 0;
        switch (operation) {
            case "+":
                val = ADD;
                break;
            case "-":
                val = SUB;
                break;
            case "*":
                val = MUL;
                break;
            case "/":
                val = DIV;
                break;
            default:
                break;
        }
        return val;
    }

}