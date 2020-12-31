package base.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author wsh
 * @date 2020/12/29 15:42
 */
public class TextFileTest {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Employee[] list = new Employee[3];
        list[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        list[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        list[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        try (PrintWriter out = new PrintWriter("D:\\ideacode\\java-code-example\\src\\base\\io\\employee3.txt", "UTF-8")) {
            writeData(list, out);
        }

        try (Scanner in = new Scanner(
                new FileInputStream("D:\\ideacode\\java-code-example\\src\\base\\io\\employee3.txt"), "UTF-8")) {
            Employee[] newList = readData(in);
            for (Employee employee : newList) {
                System.out.println(employee);
            }
        }
    }

    private static Employee[] readData(Scanner in) {
        int n = in.nextInt();
        // 读完n 当前还有个空行
        in.nextLine();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            employees[i] = readEmployee(in);
        }
        return employees;
    }

    private static Employee readEmployee(Scanner in) {
        String line = in.nextLine();
        String[] tokens = line.split("\\|");
        String name = tokens[0];
        double salary = Double.parseDouble(tokens[1]);
        LocalDate hireDate = LocalDate.parse(tokens[2]);
        return new Employee(name, salary, hireDate.getYear(), hireDate.getMonthValue(), hireDate.getDayOfMonth());
    }

    private static void writeData(Employee[] list, PrintWriter out) {
        out.println(list.length);

        for (Employee e : list) {
            writeEmployee(out, e);
        }
    }

    private static void writeEmployee(PrintWriter out, Employee e) {
        out.println(e.getName() + "|" + e.getSalary() + "|" + e.getBirth());
    }
}

class Employee {

    private String name;
    private double salary;
    private LocalDate birth;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.birth = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birth=" + birth +
                '}';
    }
}