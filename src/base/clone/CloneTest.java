package base.clone;

/**
 * @author wsh
 * @date 2019/11/21 16:54
 */
public class CloneTest {

    public static void main(String[] args) {
        try {
            Employee original = new Employee("Jerry", 3000);
            original.setHireDay(1995, 1,1);
            Employee copy = original.clone();
//            copy.raiseSalary(10);
//            copy.setHireDay(2000, 2,2);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);
            System.out.println(original==copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        /*
        测试结果：
            original=Employee{name='Jerry', salary=3000.0, hireDay=Sun Jan 01 00:00:00 CST 1995}
            copy=Employee{name='Jerry', salary=3300.0, hireDay=Wed Feb 02 00:00:00 CST 2000}
         */
    }
}
