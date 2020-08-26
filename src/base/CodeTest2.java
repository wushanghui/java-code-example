package base;

/**
 * @author wsh
 * @date 2020-08-07 20:29
 */
public class CodeTest2 {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);


    }
}

class Node{
    int val;
    Node next;
    Node(int x) {
        val = x;
    }
}
