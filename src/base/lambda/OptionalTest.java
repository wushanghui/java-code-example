package base.lambda;

import java.util.Optional;

/**
 * @author wsh
 * @date 2019/11/22 9:25
 */
public class OptionalTest {

    public static void main(String[] args) {
        Person person = null;
        PersonDto persoonDto = new PersonDto();
        Optional.ofNullable(person).ifPresent(person1 -> {
            persoonDto.setAge(person1.getAge());
            persoonDto.setName(person1.getName());
        });
        persoonDto.setName("");
        System.out.println(person);
        System.out.println(persoonDto);
    }
}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PersonDto {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersoonDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
