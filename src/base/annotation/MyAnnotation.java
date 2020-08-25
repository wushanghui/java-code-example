package base.annotation;

import java.lang.annotation.*;
        import static java.lang.annotation.ElementType.*;

/**
 * @author jue
 * @date 2020/7/19 14:44
 * @describe
 */
@Repeatable(MyAnnotation2.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER, TYPE_USE})
public @interface MyAnnotation {

    String value() default "hello";
}

