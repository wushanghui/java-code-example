package base.clone;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author wsh
 * @date 2019-11-14 20:31
 */
public class Employee implements Cloneable {

    private String name;
    private double salary;
    /**
     * 雇佣日期
     */
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        //1、看Employee类有3个域，name 域是不可变的，salary域是基本数据类型，可以直接调用父类Object.clone()方法进行浅拷贝
        Employee cloned = (Employee) super.clone();
        //2、hireDay域是可变的，需要建立深拷贝
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
