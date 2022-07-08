package base.collection.set;

import java.util.HashSet;

/**
 * @author 吴尚慧
 * @since 2022/7/6 22:07
 */
public class HashSetTest {

    public static void main(String[] args) {
        HashSet<Object> objects = new HashSet<>();
        boolean add1 = objects.add(1);
        boolean add2 = objects.add(null);
        boolean add3 = objects.add(null);
        System.out.println(add1); // true
        System.out.println(add2); // true
        System.out.println(add3); // false
    }
}
