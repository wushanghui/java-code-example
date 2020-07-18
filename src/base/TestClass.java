package base;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wsh
 * @date 2020/1/8 10:55
 */
public class TestClass {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("aa");
        //list1.add("bb");
        List<String> list2 = new ArrayList<>();
        list2.add("roll_cc");
        list2.add("roll_bb");

        List<String> list1Roll = list1.stream().map(item -> "roll_" + item).collect(Collectors.toList());
        System.out.println(list1Roll);
        boolean b = list1Roll.retainAll(list2);
        System.out.println(list1Roll);
        System.out.println(b);
        System.out.println("--------------------");
        for (String s : list1) {

        }
    }

    @Test
    public void test() {

        String str = "000010";
        System.out.println(new BigDecimal(str));
        System.out.println(Season.SPRING.getName());
    }
    @Test
    public void test2() {


    }

}

enum Season {
    SPRING("春季", 1),
    SUMMER("夏季", 2),
    FALL("秋季", 3),
    WINTER("冬季", 4);

    private Season(String name, int id) {
        this.name = name;
        this.id = id;
    }

    private final String name;
    private final int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


}
