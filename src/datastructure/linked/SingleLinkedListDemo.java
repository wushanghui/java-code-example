package datastructure.linked;

import java.util.List;

/**
 * @author wsh
 * @date 2020-09-03 10:48
 */
public class SingleLinkedListDemo {

    public static void main(String[] args) {
        // 1、准备工作
        // 1.1 创建节点
        Node node1 = new Node(1, "第1个节点");
        Node node2 = new Node(2, "第2个节点");
        Node node3 = new Node(3, "第3个节点");
        Node node4 = new Node(4, "第4个节点");
        // 1.2 创建链表
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        // 2、测试添加
        // 2.1 随意添加节点
//        singleLinkedList.add(node1);
//        singleLinkedList.add(node4);
//        singleLinkedList.add(node3);
//        singleLinkedList.add(node2);
//        System.out.println("随意添加节点显示：");
//        singleLinkedList.list();
//        singleLinkedList.removeAll();

        // 2.2 顺序添加节点
        singleLinkedList.addByOrder(node1);
        singleLinkedList.addByOrder(node4);
        singleLinkedList.addByOrder(node3);
        singleLinkedList.addByOrder(node2);
        System.out.println("顺序添加节点显示：");
        singleLinkedList.list();
        System.out.println("reverse");
        SingleLinkedList.reverse(singleLinkedList.getHead());
        singleLinkedList.list();
        // 3、测试修改
//        singleLinkedList.update(new Node(3, "第三个节点~~"));
//        System.out.println("修改链表节点后显示：");
//        singleLinkedList.list();
//        // 4、测试删除
//        singleLinkedList.delete(2);
//        System.out.println("删除链表一个节点后显示：");
//        singleLinkedList.list();
//        singleLinkedList.delete(1);
//        singleLinkedList.delete(4);
//        singleLinkedList.delete(3);
//        System.out.println("陆续删除链表中所有节点后显示：");
//        singleLinkedList.list();

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

    public Node getHead() {
        return head;
    }

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

    /**
     * 修改链表中的节点，注意，id不变，它是节点确定的标志
     *
     * @param node 要修改的节点
     */
    public void update(Node node) {
        // 判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空！");
            return;
        }
        // 辅助变量
        Node temp = head.next;
        boolean isExist = false;
        while (temp != null) {
            if (temp.id == node.id) {
                isExist = true;
                break;
            }
            temp = temp.next;
        }
        if (isExist) {
            temp.name = node.name;
        } else {
            System.out.printf("链表中不存在编号 %d 的节点\n", node.id);
        }
    }

    /**
     * 删除节点
     *
     * @param id 要删除节点的ip
     */
    public void delete(int id) {
        Node temp = head;
        // 是否找到要删除的几点
        boolean flag = false;
        while (temp.next != null) {
            if (temp.next.id == id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.printf("要删除的 %d 节点不存在\n", id);
        }
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
    public void removeAll() {
        head.next = null;
        System.out.println("-------清空链表---------");
    }

    /**
     * 获取有效节点的个数
     *
     * @param head 头节点
     * @return 个数
     */
    public static int getLength(Node head) {
        if (head.next == null) {
            return 0;
        }
        int length = 0;
        // temp 辅助几点，不计算头节点
        Node temp = head.next;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    /**
     * 查找单链表中的倒数第 k 个结点
     * @param head 头节点
     * @param index 倒第几个
     * @return 倒第 几个 节点
     */
    public static Node findLastIndexNode(Node head, int index) {
        if (head.next == null) {
            return null;
        }
        // 1. 获取链表的总长度
        int size = getLength(head);
        // 校验合法性
        if (index <= 0 || index > size) {
            return null;
        }
        // 辅助变量，使用for循环，定位到倒第index个节点
        Node cur = head.next;
        for (int i = 0; i < size - index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    /**
     * 单链表反转
     */
    public static Node reverse(Node head) {
        if (head.next == null) {
            return null;
        }
        Node cur = head.next;
        // next 指向当前节点的下一个节点
        Node next = null;
        // 遍历原来的链表，没遍历一个节点，就将其取出，放在新的链表 reverseHead 的最前端
        Node reverseHead = new Node(0, "");
        while (cur != null) {
            // 暂时存下当前节点的下一个节点
            next = cur.next;
            // 将cur的下一个节点指向新的链表的最前端
            cur.next = reverseHead.next;
            // 将当前的cur 连接到新的链表上
            reverseHead.next = cur;
            // 当前cur后移
            cur = next;
        }
        // 最终实现单链表的反转
        head.next = reverseHead.next;
        return head;
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