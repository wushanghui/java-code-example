package base.annotation;

import java.util.ArrayList;

/**
 * @author jue
 * @date 2020/7/19 14:49
 * @describe
 */
public class AnnotationTest {
}

//jdk 8之前的写法：
//@MyAnnotation2({@MyAnnotation(value="hi"),@MyAnnotation(value="hi")})
@MyAnnotation(value="a")
@MyAnnotation(value="b")
class Person{
    private String name;
    private int age;

    public Person() {
    }
    @MyAnnotation
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @MyAnnotation
    public void walk(){
    }
    public void eat(){
    }
}

class TypeDefine<@MyAnnotation3 T>{

    private T t;

    public <@MyAnnotation3 U> U test(U u) {
        return u;
    }
}

class Generic<@MyAnnotation4 T>{

    public void show() throws @MyAnnotation4 RuntimeException{

        ArrayList<@MyAnnotation4 String> list = new ArrayList<>();

        int num = (@MyAnnotation4 int) 10L;
    }

}