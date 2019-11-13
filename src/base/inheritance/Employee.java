package base.inheritance;

import java.time.LocalDate;

/**
 * @author wsh
 * @date 2019-11-13 22:35
 */
public class Employee {

    private String name;
    private double salary;
    /**
     * 雇佣日期
     */
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
