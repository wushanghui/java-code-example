package datastructure.linked;

/**
 * @author wsh
 * @date 2020-09-03 10:48
 */
public class DoubleLinkedListDemo {

    public static void main(String[] args) {
        System.out.println("双向链表测试：");
        // 1、准备工作
        // 1.1 创建节点
        Node2 node1 = new Node2(1, "第1个节点");
        Node2 node2 = new Node2(2, "第2个节点");
        Node2 node3 = new Node2(3, "第3个节点");
        Node2 node4 = new Node2(4, "第4个节点");
        // 1.2 创建链表
        DoubleLinkedList linkedList = new DoubleLinkedList();
        // 2、测试添加
        linkedList.add(node1);
        linkedList.add(node4);
        linkedList.add(node3);
        linkedList.add(node2);
        System.out.println("添加节点显示：");
        linkedList.list();
        // 3、修改
        linkedList.update(new Node2(3, "修改节点3"));
        System.out.println("修改后的链表显示：");
        linkedList.list();
        // 4、删除
        linkedList.delete(2);
        System.out.println("删除后链表显示：");
        linkedList.list();
    }
}

/**
 * 单向链表
 */
class DoubleLinkedList {

    /**
     * 初始化头节点，不放数据，不能动
     */
    private Node2 head = new Node2(0, "");

    public Node2 getHead() {
        return head;
    }

    /**
     * 添加节点
     *
     * @param node 要添加的节点
     */
    public void add(Node2 node) {
        // temp 表示最后一个节点
        Node2 temp = head;
        while (temp.next != null) {
            // 没有到链表最后，将temp后移，继续找
            temp = temp.next;
        }
        // 链表最后
        temp.next = node;
        node.pre = temp;
    }

    /**
     * 修改链表中的节点，注意，id不变，它是节点确定的标志
     *
     * @param node 要修改的节点
     */
    public void update(Node2 node) {
        // 判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空！");
            return;
        }
        // 辅助变量
        Node2 temp = head.next;
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
     * 双向链表可以自我删除
     * @param id 要删除节点的ip
     */
    public void delete(int id) {
        Node2 temp = head.next;
        // 是否找到要删除的几点
        boolean flag = false;
        while (temp != null) {
            if (temp.id == id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            // 这里实现了自我删除
            temp.pre.next = temp.next;
            // 这里要判断下，不判断，如果temp是最后一个节点会出现空指针
            if (temp.next != null) {
                temp.next.pre = temp.pre;
            }
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
        Node2 temp = head.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

}

class Node2 {

    public int id;
    public String name;
    public Node2 pre;
    public Node2 next;

    public Node2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}