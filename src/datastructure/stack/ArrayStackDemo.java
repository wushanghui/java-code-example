package datastructure.stack;

import java.util.Scanner;

/**
 * @author wsh
 * @date 2020/9/8 3:31 下午
 */
public class ArrayStackDemo {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        while (loop) {
            System.out.println("show：显示栈");
            System.out.println("exit：退出程序");
            System.out.println("push：添加数据入栈");
            System.out.println("pop 从栈顶取出数据");
            String key = scanner.next();
            switch (key) {
                case "show":
                    stack.list();
                    break;
                case "push":
                    System.out.println("请输入一个数：");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case "pop":
                    int result = stack.pop();
                    System.out.printf("%d 出栈\n", result);
                    break;
                case "exit":
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}

class ArrayStack {
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

    public ArrayStack(int maxSize) {
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
}
