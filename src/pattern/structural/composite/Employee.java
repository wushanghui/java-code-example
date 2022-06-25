package pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工
 *
 * @author 吴尚慧
 * @since 2022/6/25 22:37
 */
public class Employee {
    /**
     * 姓名
     */
    private final String name;
    /**
     * 部门
     */
    private final String dept;
    /**
     * 薪水
     */
    private final int salary;
    /**
     * 下属
     */
    private final List<Employee> subordinates;

    //构造函数
    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<>();
    }

    /**
     * 添加下属
     *
     * @param e 下属
     */
    public void add(Employee e) {
        subordinates.add(e);
    }

    /**
     * 移除下属
     *
     * @param e 下属
     */
    public void remove(Employee e) {
        subordinates.remove(e);
    }

    /**
     * 获取下属列表
     *
     * @return 下属列表
     */
    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
