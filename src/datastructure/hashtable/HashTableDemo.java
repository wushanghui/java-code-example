package datastructure.hashtable;

import java.util.Scanner;

/**
 * @author jue
 * @date 2020/12/16 22:39
 * @describe
 */
public class HashTableDemo {


    public static void main(String[] args) {
        HashTab hashTab = new HashTab(7);

        String key;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("==== 菜单 ====");
            System.out.println("add: 添加员工");
            System.out.println("list: 显示员工");
            System.out.println("find: 查找员工");
            System.out.println("exit: 退出");
            System.out.println("=============");

            key = scanner.next();
            switch (key) {
                case "add":
                    System.out.println("输入id：");
                    int id = scanner.nextInt();
                    System.out.println("输入名称：");
                    String name = scanner.next();
                    Emp emp = new Emp(id, name);
                    hashTab.add(emp);
                    break;
                case "list":
                    hashTab.list();
                    break;
                case "find":
                    System.out.println("请输入要找到的id：");
                    id = scanner.nextInt();
                    hashTab.findEmpById(id);
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}

class HashTab {
    private EmpLinkedList[] empLinkedListArray;
    /**
     * 链表的个数
     */
    private int size;

    public HashTab(int size) {
        this.size = size;
        empLinkedListArray = new EmpLinkedList[size];
        for (int i = 0; i < empLinkedListArray.length; i++) {
            empLinkedListArray[i] = new EmpLinkedList();
        }
    }

    /**
     * 添加员工
     *
     * @param emp 员工对象
     */
    public void add(Emp emp) {
        int empLinkedListNo = hashFun(emp.id);
        empLinkedListArray[empLinkedListNo].add(emp);
    }

    public void list() {
        for (int i = 0; i < size; i++) {
            empLinkedListArray[i].list(i);
        }
    }

    /**
     * 根据id 查找员工
     *
     * @param id id
     */
    public void findEmpById(int id) {
        int empLinkedListNo = hashFun(id);
        Emp emp = empLinkedListArray[empLinkedListNo].findEmpById(id);
        if (emp != null) {
            System.out.printf("在第%d 条链条中找到 员工 id=%d\n", empLinkedListNo + 1, id);
        } else {
            System.out.println("在哈希表中，没有找到该员工！");
        }


    }

    /**
     * 使用简单取模来代替 散列函数
     *
     * @param id id
     * @return
     */
    public int hashFun(int id) {
        return id % size;
    }


}

/**
 * 员工类
 */
class Emp {
    public int id;
    public String name;
    public Emp next;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

/**
 * 链表
 */
class EmpLinkedList {

    private Emp head;

    /**
     * 添加员工到链表（添加到链表最后）
     * 这里我们约定员工的id是自增的
     *
     * @param emp 员工
     */
    public void add(Emp emp) {
        if (head == null) {
            head = emp;
            return;
        }
        Emp curEmp = head;
        // 找到链表的最后一个节点
        while (true) {
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next;
        }
        curEmp.next = emp;

    }

    public void list(int no) {
        if (head == null) {
            System.out.println("第 " + (no + 1) + " 链表为空");
            return;
        }

        Emp curEmp = head;
        while (true) {
            System.out.printf("第 " + (no + 1) + " 链表 =>id=%d name=%s\t", curEmp.id, curEmp.name);
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next;
        }
        System.out.println();

    }

    /**
     * 根据id查找员工
     *
     * @param id 员工id
     * @return 员工对象
     */
    public Emp findEmpById(int id) {
        if (head == null) {
            System.out.println("链表为空");
            return null;
        }
        Emp curEmp = head;
        while (true) {
            if (curEmp.id == id) {
                break;
            }
            if (curEmp.next == null) {
                curEmp = null;
                break;
            }
            curEmp = curEmp.next;
        }
        return curEmp;
    }


}