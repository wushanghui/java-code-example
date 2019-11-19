package base.interfaces;

import java.util.Arrays;

/**
 * @author wsh
 * @date 2019/11/19 17:15
 */
public class EmployeeSortTest {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Jerry", 5000);
        employees[1] = new Employee("Tom", 7000);
        employees[2] = new Employee("Harry", 4000);
        //正序
        Arrays.sort(employees);
        Arrays.stream(employees).forEach(System.out::println);
        /*
        结果：
            Employee{name='Harry', salary=4000.0}
            Employee{name='Jerry', salary=5000.0}
            Employee{name='Tom', salary=7000.0}
         */
    }
}
