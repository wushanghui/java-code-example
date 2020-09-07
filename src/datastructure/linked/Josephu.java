package datastructure.linked;

/**
 * @author wsh
 * @date 2020/9/7 4:30 下午
 */
public class Josephu {

    public static void main(String[] args) {
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        // 圈中小孩总数
        int nums = 20;
        circleSingleLinkedList.add(nums);
        System.out.println("圈中所有小孩：");
        circleSingleLinkedList.showChild();
        // 从第几个小孩开始报数
        int startNo = 3;
        // 报几下数
        int countNum = 4;
        System.out.printf("圈中共有 %d 个小孩，从第 %d 个小孩开始报数，报 %d 下出圈\n", nums, startNo, countNum);
        circleSingleLinkedList.countChild(startNo, countNum, nums);
    }
}

class CircleSingleLinkedList {
    private Child first = null;

    /**
     * 构建环形链表
     *
     * @param nums 小孩数
     */
    public void add(int nums) {
        if (nums < 1) {
            System.out.println("nums的值不正确！");
            return;
        }
        Child cur = null;
        for (int i = 1; i <= nums; i++) {
            Child child = new Child(i);

            if (i == 1) {
                first = child;
                first.setNext(first);
                cur = first;
            } else {
                cur.setNext(child);
                child.setNext(first);
                cur = child;
            }
        }
    }

    /**
     * 显示环形链表
     */
    public void showChild() {
        if (first == null) {
            System.out.println("没有小孩");
            return;
        }
        Child curChild = first;
        while (true) {
            System.out.printf("小孩编号 %d \n", curChild.getId());
            if (curChild.getNext() == first) {
                break;
            }
            curChild = curChild.getNext();

        }

    }

    /**
     * 根据入参，计算小孩出圈的顺序
     *
     * @param startNo  从第几个小孩开始数数
     * @param countNum 数几下
     * @param nums     一共多少个小孩
     */
    public void countChild(int startNo, int countNum, int nums) {
        if (first == null || startNo < 1 || startNo > nums) {
            System.out.println("参数错误");
            return;
        }
        Child helper = first;
        // 把辅助节点指向环形链表的最后一个节点
        while (helper.getNext() != first) {
            helper = helper.getNext();
        }
        // 小孩报数前，把first和helper 移动到第一个报数小孩上
        for (int i = 0; i < startNo - 1; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }

        // 圈中有两个或两个以上小孩
        // helper == first 表示圈中只有一个小孩
        while (helper != first) {
            for (int i = 0; i < countNum - 1; i++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.printf("小孩 %d 出圈\n", first.getId());
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.printf("最后留在圈中的小孩编号 %d\n", first.getId());
    }
}

/**
 * 小孩
 */
class Child {
    private int id;
    private Child next;

    public Child(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Child getNext() {
        return next;
    }

    public void setNext(Child next) {
        this.next = next;
    }

}