package base.generic;

import java.util.ArrayList;

/**
 * @author jue
 * @date 2020/7/25 22:19
 * @describe
 */
public class GenericTest {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("abc");
        arrayList.add(Integer.valueOf(123));
        for (int i = 0; i < arrayList.size(); i++) {
            Object o = arrayList.get(i);
            System.out.println(o);
        }
    }
}
