package base.lambda;


import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @author wsh
 * @date 2019/11/21 18:08
 */
public class LambdaTest {

    public static void main(String[] args) {
        String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println("planets 数组排序前：" + Arrays.toString(planets));
        Arrays.sort(planets);
        System.out.println("planets 数组自然排序后：" + Arrays.toString(planets));
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println("planets 数组根据长度排序后：" + Arrays.toString(planets));

        //构造一个定时器，每隔指定的一段时间通知 listener 一次
        Timer timer = new Timer(2000, event -> System.out.println("当前时间为："+ LocalDateTime.now()));
        timer.start();
        //显示一条消息和确定按钮的对话框，这个对话框将位于其parent组件的中央，如果parent为null，对话框显示在屏幕的中央
        JOptionPane.showMessageDialog(null, "退出程序？");
        System.exit(0);
    }
}
