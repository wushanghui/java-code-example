package datastructure.queue;

/**
 * 使用数组模拟队列
 */
public class ArrayQueue {

    /**
     * 数组最大容量
     */
    private int maxSize;
    /**
     * 队列头，指向队列头部，它是指向队列头的前一个位置
     */
    private int front;
    /**
     * 队列尾，指向队列尾部，指向队列尾的数据，即就是队列最后一个数据
     */
    private int rear;
    /**
     * 存放数据，模拟队列
     */
    private int[] array;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
//        //
//        front = -1;
//        //
//        rear = -1;
    }

    /**
     * 判断队列是否已满
     */
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    /**
     * 判断队列是否为空
     */
    public boolean isEmpty() {
        return rear == front;
    }

    /**
     * 添加数据到队列
     */
    public void addQueue(int data) {
        if (isFull()) {
            System.out.println("队列已满，不能加入数据");
        } else {
            // ++rear rear 后移了一位
            array[++rear] = data;
        }
    }

    /**
     * 获取队列数据，出队列
     */
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空，不能取数据~~");
        }
        // ++front front 后移了一位
        return array[++front];
    }

    /**
     * 显示队列所有数据
     */
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空！");
        } else {
            for (int i = front; i < rear; i++) {
                System.out.printf("array[%d]=%d\n", i + 1, array[i + 1]);
            }
        }
    }

    /**
     * 显示队列的头数据，不是取数据，只是查看
     */
    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空！");
        }
        return array[front + 1];
    }
}
