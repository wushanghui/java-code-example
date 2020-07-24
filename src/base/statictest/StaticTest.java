package base.statictest;


/**
 * @author wsh
 * @date 2019-11-12 21:31
 */
public class StaticTest {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("tom", 1000);
        employees[1] = new Employee("dick", 3000);
        employees[2] = new Employee("harry", 5000);

        for (Employee e : employees) {
            e.setId();
            System.out.println("name="+e.getName()+", id="+e.getId()+", salary="+e.getSalary());
        }
        int n = Employee.getNextId();
        System.out.println("next available id="+n);
    }
}

class Employee{

    //静态域
    private static int nextId;
    //实例域
    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    //静态方法
    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        Employee e = new Employee("jerry", 5000);
        System.out.println(e.getName()+" "+e.getSalary());
    }
}
