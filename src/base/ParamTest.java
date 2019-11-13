package base;

import javax.sound.midi.Soundbank;

/**
 * @author wsh
 * @date 2019/11/13 12:34
 * 方法参数测试：
 * 1、一个方法不能修改一个基本数据类型的参数（数值型或布尔型）
 * 2、一个方法可以改变一个对象参数的状态
 * 3、一个方法不能让对象参数引用一个新的对象
 */
public class ParamTest {

    public static void main(String[] args) {
        //Test 1: 修改基本数据类型-数值型
        System.out.println("Test tripleValue:");
        double percent = 10;
        System.out.println("Before: percent="+percent);
        tripleValue(percent);
        System.out.println("After: percent="+percent);
        System.out.println("------------------------------");
        //Test 2: 改变对象参数的状态
        System.out.println("Test tripleSalary:");
        Employee2 harry = new Employee2("Harry", 2000);
        System.out.println("Before: salary="+harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary="+harry.getSalary());
        System.out.println("------------------------------");
        //Test 3: 改变对象参数的状态
        System.out.println("Test swap:");
        Employee2 a = new Employee2("Tom", 2000);
        Employee2 b = new Employee2("Jerry", 3000);
        System.out.println("Before: a="+a.getName());
        System.out.println("Before: b="+b.getName());
        swap(a, b);
        System.out.println("After: a="+a.getName());
        System.out.println("After: b="+b.getName());
        /*
        结果：
            Test tripleValue:
            Before: percent=10.0
            x=30.0
            After: percent=10.0
            ------------------------------
            Test tripleSalary:
            Before: salary=2000.0
            salary=6000.0
            After: salary=6000.0
            ------------------------------
            Test swap:
            Before: a=Tom
            Before: b=Jerry
            x=Jerry, y=Tom
            After: a=Tom
            After: b=Jerry
         */
    }

    public static void tripleValue(double x) {
        x = x * 3;
        System.out.println("x="+x);
    }

    public static void tripleSalary(Employee2 x) {
        x.raiseSalary(200);
        System.out.println("salary="+x.getSalary());
    }

    public static void swap(Employee2 x, Employee2 y) {
        Employee2 temp = x;
        x = y;
        y = temp;
        System.out.println("x="+x.getName()+", y="+y.getName());
    }
}

class Employee2{
    //实例域
    private String name;
    private double salary;

    public Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * 增加工资
     * @param byPercent 百分数
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}


