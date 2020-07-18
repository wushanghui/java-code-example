package base.constructor;

import java.util.Random;

/**
 * @author wsh
 * @date 2019/11/13 17:07
 * 构造器相关特性测试：
 * 1、重载构造器
 * 2、用this(...)调用另一个构造器
 * 3、无参数构造器
 * 4、对象初始化块
 * 5、静态初始化块
 * 6、实例域初始化
 */
public class ConstructorTest {

    public static void main(String[] args) {
        Employee3[] staff = new Employee3[3];
        staff[0] = new Employee3("Jerry", 4000);
        staff[1] = new Employee3(4000);
        staff[2] = new Employee3();
        for (Employee3 e : staff) {
            System.out.println("name="+e.getName()+", id="+e.getId()+", salary="+e.getSalary());
        }

        /*
        结果：
            name=Jerry, id=4913, salary=4000.0
            name=Employee3 #4914, id=4914, salary=4000.0
            name=, id=4915, salary=0.0
         */
    }


}

class Employee3 {

    private static int nextId;
    private int id;
    private String name = "";
    private double salary;

    //静态初始化块
    static {
        Random generator = new Random();
        //生成 0 - 9999 的随机数（0 - n-1）
        nextId = generator.nextInt(10000);
    }

    //对象初始化块
    {
        id = nextId;
        nextId++;
    }

    //三个重载的构造器
    public Employee3(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee3(double salary) {
        this("Employee3 #"+nextId, salary);
    }

    public Employee3() {
        //无参构造器
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}