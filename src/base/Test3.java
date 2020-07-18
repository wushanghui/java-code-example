package base;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author wsh
 * @date 2020/5/12 10:01
 */
public class Test3 {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.println("ping");
        System.out.println("--------------");


    }

    static void pong() {
        System.out.println("pong");
    }
}

class A {
    private String name = "dd";
    public static String str = "123";
    public void getName() {
        name.length();
        String[] strs = new String[3];
        int length = strs.length;
        System.out.println(name);
    }
}
abstract class B extends A {

    public void getAge() {

    }
}
