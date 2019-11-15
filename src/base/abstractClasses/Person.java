package base.abstractClasses;

/**
 * @author wsh
 * @date 2019/11/14 15:14
 */
public class Person {

    /**
     * 描述
     * @return str
     */
    //public abstract String getDescription();

    private String name;

    public Person(String name) {
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
