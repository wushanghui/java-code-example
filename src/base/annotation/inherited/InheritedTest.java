package base.annotation.inherited;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @author jue
 * @date 2020/7/19 9:22
 * @describe
 */
public class InheritedTest {

    public static void main(String[] args) {
        Class clazz = Student.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
@Inherited
@interface MyAnnotation {
    String value() default "Inherited";
}

@MyAnnotation
class Person {

}

class Student extends Person {

}