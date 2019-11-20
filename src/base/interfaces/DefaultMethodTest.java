package base.interfaces;

/**
 * @author wsh
 * @date 2019/11/20 18:16
 * 默认方法测试：
 * 解决默认方法冲突：
 * 1、超类优先；
 *  优先使用超类提供的方法，相同的接口的默认方法会被忽略
 * 2、接口冲突；
 *  实现类必须实现冲突的方法来解决冲突，java强调一致性
 */
public class DefaultMethodTest {

    public static void main(String[] args) {
        //1、超类优先 测试
        System.out.println("------1、超类优先 测试-------");
        Student tom = new Student("1", "Tom");
        System.out.println(tom);
        //2、接口冲突 测试
        System.out.println("--------2、接口冲突 测试-------");
        NameImpl name = new NameImpl();
        System.out.println(name.getName());
        /*
        结果：
            ------1、超类优先 测试-------
            Student{id='1', name='Tom'}
            --------2、接口冲突 测试-------
            base.interfaces.NameImpl_356573597
         */
    }
}

interface Named1 {

    default String getName() {
        return getClass().getName() + "_" + hashCode();
    }
}

interface Named2 {

    default String getName() {
        return getClass().getName() + "_" + hashCode();
    }
}

class NameImpl implements Named1, Named2{

    @Override
    public String getName() {
        return getClass().getName() + "_" + hashCode();
    }
}

interface Named {

    default String getName() {
        return getClass().getName() + "_" + hashCode();
    }
}

class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person implements Named{

    private String id;

    Student(String id, String name) {
        super(name);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' + ", name='" + super.getName() + "'" +
                '}';
    }
}
