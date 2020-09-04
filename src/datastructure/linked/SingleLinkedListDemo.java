package datastructure.linked;

/**
 * @author wsh
 * @date 2020-09-03 10:48
 */
public class SingleLinkedListDemo {

    public static void main(String[] args) {
        // 1、创建节点
        Node node1 = new Node(1, "第1个节点");
        Node node2 = new Node(2, "第2个节点");
        Node node3 = new Node(3, "第3个节点");
        Node node4 = new Node(4, "第4个节点");

        // 2、创建链表
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        // 3、随意添加节点
        singleLinkedList.add(node1);
        singleLinkedList.add(node4);
        singleLinkedList.add(node3);
        singleLinkedList.add(node2);
        // 4、遍历
        System.out.println("随意添加节点显示：");
        singleLinkedList.list();
        // 5、清空
        singleLinkedList.removeAll();
        // 6、顺序添加节点
        singleLinkedList.addByOrder(node1);
        singleLinkedList.addByOrder(node4);
        singleLinkedList.addByOrder(node3);
        singleLinkedList.addByOrder(node2);
        // 7、遍历
        System.out.println("顺序添加节点显示：");
        singleLinkedList.list();


    }
}

/**
 * 单向链表
 */
class SingleLinkedList {

    /**
     * 初始化头节点，不放数据，不能动
     */
    private Node head = new Node(0, "");

    /**
     * 添加节点
     *
     * @param node 要添加的节点
     */
    public void add(Node node) {
        // temp 表示最后一个节点
        Node temp = head;
        while (temp.next != null) {
            // 没有到链表最后，将temp后移，继续找
            temp = temp.next;
        }
        // 链表最后
        temp.next = node;
    }

    /**
     * 添加节点（根据id顺序添加）
     *
     * @param node 要添加的节点
     */
    public void addByOrder(Node node) {
        // temp 实际要代表我们要添加位置的前一个节点
        Node temp = head;
        // 需要添加的编号是否存在，默认不存在
        boolean flag = false;

        while (true) {
            if (temp.next == null) {
                // 链表最后
                break;
            }
            if (temp.next.id > node.id) {
                break;
            } else if (temp.next.id == node.id) {
                flag = true;
                break;
            }
            // 将temp后移，继续遍历
            temp = temp.next;
        }
        if (flag) {
            System.out.printf("插入的节点 %d 已存在，不能添加！\n", node.id);
        } else {
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void update() {
        // 判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空！");
            return;
        }
        // 辅助变量
        Node temp = head.next;
        boolean isExist = false;

    }

    /**
     * 显示链表
     */
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        Node temp = head.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    /**
     * 清空链表
     */
    public void removeAll(){
        head.next = null;
        System.out.println();
    }

}

class Node {

    public int id;
    public String name;
    public Node next;

    public Node(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}