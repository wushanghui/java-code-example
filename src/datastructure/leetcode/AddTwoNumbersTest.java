package datastructure.leetcode;

public class AddTwoNumbersTest {

    public static void main(String[] args) {
        AddTwoNumbersTest test = new AddTwoNumbersTest();

//        test.addTwoNumbers();
    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        l1.getVal() + l2.getVal()
//    }
}

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
