package base.objectAnalyzer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wsh
 * @date 2019/11/19 10:25
 */
public class ObjectAnalyzerTest {

    public static void main(String[] args) {
        String str = "ni,ahod,好的";
        System.out.println(new ObjectAnalyzer().toString(str));

        List<Integer> squares = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));

        /*
        结果：
            ni,ahod,好的
            java.util.ArrayList[elementData=class java.lang.Object[]{java.lang.Integer[value=0][][], java.lang.Integer[value=1][][], java.lang.Integer[value=4][][], java.lang.Integer[value=9][][], java.lang.Integer[value=16][][], java.lang.Integer[value=25][][], null, null, null, null}, size=6][modCount=6][][]

         */
    }
}
