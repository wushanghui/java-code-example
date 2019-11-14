package base.equals;

/**
 * @author wsh
 * @date 2019-11-14 21:03
 */
public class EqualsTest {

    public static void main(String[] args) {
        Employee tom1 = new Employee("tom", 4000, 1990, 1, 2);
        Employee tom2 = tom1;
        Employee tom3 = new Employee("tom", 4000, 1990, 1, 2);
        Employee jerry = new Employee("jerry", 7000, 1994, 6, 21);
        System.out.println("tom1 == tom2: " + (tom1==tom2));

        System.out.println("tom1 == tom3: " + (tom1==tom3));

        System.out.println("tom1.equals(tom3): " + tom1.equals(tom3));

        System.out.println("tom1.equals(jerry): " + tom1.equals(jerry));

        System.out.println("jerry.toString(): "+ jerry);

        Manager harry1 = new Manager("harry", 10000, 1987, 4, 10);
        Manager harry2 = new Manager("harry", 10000, 1987, 4, 10);
        harry2.setBonus(5000);
        System.out.println("harry2.toString(): " + harry2);
        System.out.println("harry1.equals(harry2): " + harry1.equals(harry2));

        System.out.println("tom1.hashCode(): " + tom1.hashCode());
        System.out.println("tom3.hashCode(): " + tom3.hashCode());
        System.out.println("harry1.hashCode(): " + harry1.hashCode());
        System.out.println("harry2.hashCode(): " + harry2.hashCode());

        /*
        结果：
            tom1 == tom2: true
            tom1 == tom3: false
            tom1.equals(tom3): true
            tom1.equals(jerry): false
            jerry.toString(): base.equals.Employee[name='jerry', salary=7000.0, hireDay=1994-06-21]
            harry2.toString(): base.equals.Manager[name='harry', salary=10000.0, hireDay=1987-04-10][bonus=5000.0]
            harry1.equals(harry2): false
            tom1.hashCode(): -603055757
            tom3.hashCode(): -603055757
            harry1.hashCode(): 24525833
            harry2.hashCode(): 1298285577
         */
    }
}
