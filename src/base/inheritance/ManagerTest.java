package base.inheritance;

/**
 * @author wsh
 * @date 2019-11-13 22:43
 * this和super比较
 * this：
 *  1、引用隐式参数；
 *  2、调用该类的其他构造器
 * super：
 *  1、调用超类的方法；
 *  2、调用超类的构造器，只能作为一个构造器的第一条语句出现
 *
 * 构造参数既可以传递给本类的其他构造器（this），也可以传递给超类的构造器（super）。
 */
public class ManagerTest {

    public static void main(String[] args) {
        Manager boss = new Manager("Jerry", 8000, 1993, 9, 10);
        boss.setBonus(3000);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Tom", 4000, 1995, 3,5);
        staff[2] = new Employee("Harry", 5000, 1997, 5, 9);

        for (Employee e : staff) {
            System.out.println("name="+e.getName()+", salary="+e.getSalary());
        }

        /*
        结果：
            name=Jerry, salary=11000.0
            name=Tom, salary=4000.0
            name=Harry, salary=5000.0
         */

    }

}
