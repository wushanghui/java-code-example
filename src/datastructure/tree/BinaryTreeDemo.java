package datastructure.tree;

/**
 * @author wsh
 * @date 2020/12/25 13:24
 */
public class BinaryTreeDemo {

    public static void main(String[] args) {
        // 创建一个二叉树
        BinaryTree binaryTree = new BinaryTree();
        // 创建节点
        Node root = new Node(1, "one");
        Node node2 = new Node(2, "two");
        Node node3 = new Node(3, "three");
        Node node4 = new Node(4, "four");
        Node node5 = new Node(5, "five");

        // 手动创建二叉树
        root.setLeft(node2);
        root.setRight(node3);
        node3.setLeft(node4);
        node3.setRight(node5);
        binaryTree.setRoot(root);

        System.out.println("前序遍历：");
        binaryTree.prefixOrder();

        System.out.println("中序遍历：");
        binaryTree.infixOrder();

        System.out.println("后序遍历：");
        binaryTree.postfixOrder();
    }
}

/**
 * 二叉树
 */
class BinaryTree {
    private Node root;

    public void setRoot(Node root) {
        this.root = root;
    }

    /**
     * 前序遍历
     */
    public void prefixOrder() {
        if (this.root != null) {
            this.root.prefixOrder();
        } else {
            System.out.println("二叉树为空，无法遍历！");
        }
    }

    /**
     * 中序遍历
     */
    public void infixOrder() {
        if (this.root != null) {
            this.root.infixOrder();
        } else {
            System.out.println("二叉树为空，无法遍历！");
        }
    }

    /**
     * 后序遍历
     */
    public void postfixOrder() {
        if (this.root != null) {
            this.root.postfixOrder();
        } else {
            System.out.println("二叉树为空，无法遍历！");
        }
    }

    /**
     * 前序查找
     * @param no id
     * @return 查找到节点
     */
    public Node prefixOrderSearch(int no) {
        if (this.root != null) {
            return this.root.prefixOrderSearch(no);
        }
        return null;
    }
}

/**
 * 节点
 */
class Node {

    private int no;
    private String name;
    private Node left;
    private Node right;

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    public void prefixOrder() {
        // 输出父节点
        System.out.println(this);
        // 向左子树前序递归遍历
        if (this.left != null) {
            this.left.prefixOrder();
        }
        // 向右子树前序递归遍历
        if (this.right != null) {
            this.right.prefixOrder();
        }
    }

    public void infixOrder() {
        // 向左子树中序递归遍历
        if (this.left != null) {
            this.left.infixOrder();
        }
        // 输出父节点
        System.out.println(this);
        // 向右子树中序递归遍历
        if (this.right != null) {
            this.right.infixOrder();
        }
    }

    public void postfixOrder() {
        // 向左子树后序递归遍历
        if (this.left != null) {
            this.left.postfixOrder();
        }
        // 向右子树后序递归遍历
        if (this.right != null) {
            this.right.postfixOrder();
        }
        // 输出父节点
        System.out.println(this);
    }

    public Node prefixOrderSearch(int no) {
        return null;
    }
}
