package datastructure.queue;

/**
 * 使用数组模拟环形队列
 */
public class CircleArrayQueue {

    /**
     * 数组最大容量
     */
    private int maxSize;
    /**
     * 队列头, 指向队列的第一个元素
     * 初始值为 0
     */
    private int front;
    /**
     * 队列尾，指向队列的最后一个元素的后一个位置，希望空出一个空间作为约定
     * 初始值为 0
     */
    private int rear;
    /**
     * 存放数据，模拟队列
     */
    private int[] array;

    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
    }

    /**
     * 判断队列是否已满
     */
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
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
            array[rear] = data;
            // 将rear后移，这里必须取模
            rear = (rear + 1) % maxSize;
            System.out.println("front: "+front);
            System.out.println("rear: "+rear);
        }
    }

    /**
     * 获取队列数据，出队列
     */
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空，不能取数据~~");
        }
        // 这里需要分析出front 是指向队列的第一个元素
        // 1、先将 front 对应的值保留到一个临时变量中
        // 2、将front后移，考虑取模
        // 3、将临时变量的值返回
        int value = array[front];
        System.out.println("front % before："+front);
        front = (front + 1) % maxSize;
        System.out.println("front % after: "+front);
        return value;
    }

    /**
     * 显示队列所有数据
     */
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空！");
        } else {
            // 从front 开始遍历，遍历多少个元素
            for (int i = front; i < front + size(); i++) {
                System.out.printf("array[%d]=%d\n", i % maxSize, array[i % maxSize]);
            }
        }
    }

    /**
     * 当前队列有效数据的个数
     */
    public int size() {
        return (rear + maxSize - front) % maxSize;
    }

    /**
     * 显示队列的头数据，不是取数据，只是查看
     */
    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空！");
        }
        return array[front];
    }
}
