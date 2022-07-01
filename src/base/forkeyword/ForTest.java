package base.forkeyword;

import java.util.Arrays;

/**
 * @author 吴尚慧
 * @since 2022/6/30 11:47
 */
public class ForTest {

    public static void main(String[] args) {
        System.out.println("-----------------");
        String[] names = {"Robert", "John", "Julie", "Lora"};

        for (java.util.Iterator<String> iterator = Arrays.stream(names).iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }

        System.out.println("-----------------");

        for (int i = 0; i < names.length;) {
            System.out.println(names[i]);
            i++;
        }
    }
}
