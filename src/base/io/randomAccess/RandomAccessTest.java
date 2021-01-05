package base.io.randomAccess;

import base.io.Employee;

import java.io.DataInput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDate;

/**
 * @author wsh
 * @date 2020-12-31 22:52
 */
public class RandomAccessTest {

    public static void main(String[] args) throws IOException {
        Employee[] list = new Employee[3];
        list[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        list[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        list[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        String filePath = "/Users/wushanghui/IdeaProjects/java-code-example/src/base/io/randomAccess/employee.txt";
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(filePath))) {
            for (Employee e : list) {
                writeData(out, e);
            }
        }

        try (RandomAccessFile in = new RandomAccessFile(filePath, "r")) {
            int n = (int) (in.length() / Employee.RECORD_SIZE);
            Employee[] newList = new Employee[n];
            for (int i = n - 1; i >= 0; i--) {
                newList[i] = new Employee();
                in.seek(i * Employee.RECORD_SIZE);
                newList[i] = readData(in);
            }
            for (Employee e : newList) {
                System.out.println(e);
            }
        }
    }

    public static void writeData(DataOutputStream out, Employee e) throws IOException {
        DataIO.writeFixedString(e.getName(), Employee.NAME_SIZE, out);
        out.writeDouble(e.getSalary());

        LocalDate hireDay = e.getHireDay();
        out.writeInt(hireDay.getYear());
        out.writeInt(hireDay.getMonthValue());
        out.writeInt(hireDay.getDayOfMonth());
    }

    public static Employee readData(DataInput in) throws IOException {
        String name = DataIO.readFixedString(Employee.NAME_SIZE, in);
        double salary = in.readDouble();
        int y = in.readInt();
        int m = in.readInt();
        int d = in.readInt();
        return new Employee(name, salary, y, m, d);
    }
}
