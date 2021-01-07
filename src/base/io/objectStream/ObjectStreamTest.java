package base.io.objectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author wsh
 * @date 2021-01-06 20:11
 */
public class ObjectStreamTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        Manager carl = new Manager("Carl Cracker", 75000, 1987, 12, 15);
        carl.setSecretary(harry);
        Manager tony = new Manager("Tony Tester", 40000, 1990, 3, 15);
        tony.setSecretary(harry);

        Employee[] staff = new Employee[3];
        staff[0] = carl;
        staff[1] = harry;
        staff[2] = tony;

        String data = "/Users/wushanghui/IdeaProjects/java-code-example/src/base/io/objectStream/employee.dat";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(data))) {
            out.writeObject(staff);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(data))) {
            Employee[] newStaff = (Employee[]) in.readObject();
            newStaff[1].raiseSalary(10);

            for (Employee e : newStaff) {
                System.out.println(e);
            }
        }
    }
}
