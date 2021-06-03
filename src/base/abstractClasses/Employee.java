package base.abstractClasses;

/**
 * @author wsh
 * @version 1.0.0
 * @date 2019/11/14 15:16
 */
public class Employee extends Person {


    private String empId;

    public Employee(String name, String empId) {
        super(name);
        this.empId = empId;
    }

//    @Override
//    public String getDescription() {
//        return null;
//    }

    @Override
    public String toString() {
        return getClass().getName();
    }
}
