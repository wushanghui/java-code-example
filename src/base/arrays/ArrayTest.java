package base.arrays;

import org.junit.Test;

import java.util.*;

/**
 * @author wsh
 * @date 2020/7/8 10:34
 */
public class ArrayTest {

    public static void main(String[] args) {
        String str = "sdfasfassdfsdgdfgdgderteytyijjhj";
        char[] strCharArray = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (Character c: strCharArray) {
            set.add(c);
        }
        System.out.println(set);
        int count = 0;
        char maxChar = str.charAt(0);

        for (Character s : set) {
            int tempCount = 0;
            for (char c: strCharArray) {
                if (c == s) {
                    tempCount++;
                }
            }
            if (tempCount >= count) {
                count = tempCount;
                maxChar = s;
            }
        };

        System.out.println("重复最多的字符：" + maxChar + ", 重复次数：" + count);
    }

    @Test
    public void test1() {

        int[] myArray = { 1, 2, 3 };
        List myList = Arrays.asList(myArray);
        System.out.println(myList.size());//1
        System.out.println(myList.get(0));//数组地址值
        System.out.println(myList.get(1));//报错：ArrayIndexOutOfBoundsException
        int [] array=(int[]) myList.get(0);
        System.out.println(array[0]);//1
    }

    @Test
    public void test2() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next.equals(2)) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    @Test
    public void test3() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(list);
        for (Integer integer : list) {
            if (integer.equals(2)) {
                list.remove(integer);
            }
        }
        System.out.println(list);
    }


}
