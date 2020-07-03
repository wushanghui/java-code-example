package base;

import jdk.nashorn.api.scripting.AbstractJSObject;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wsh
 * @date 2019/11/26 14:42
 */
public class CodeTest {

    public static void main(String[] args) throws IllegalAccessException {
        Employee employee = new Employee();
//        System.out.println("employee before: " + employee);
//        // 获取对象所有的实例域
//        Field[] fields = employee.getClass().getDeclaredFields();
//        // 获得访问私有实例域的权限
//        AccessibleObject.setAccessible(fields, true);
//        for (Field field : fields) {
//            Class<?> type = field.getType();
//            if ("String".equals(type.getSimpleName())) {
//                Object obj = field.get(employee);
//                if (obj != null) {
//                    String str = obj.toString();
//                    if ("Jerry".equals(str)) {
//                        field.set(employee, "Tom");
//                    }
//                }
//
//            }
//        }
        List<Employee> list = new ArrayList<>();
        for(Employee e : list) {
            System.out.println(e);
        }
        System.out.println("employee after: " + employee);
    }

    private static String getStr() {
        return String.valueOf(new String[]{"qq", "dd"});
    }
}

class Employee {

    private String name = "Jerry";
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
