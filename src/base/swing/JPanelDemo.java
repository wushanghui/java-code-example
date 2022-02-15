package base.swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author 吴尚慧
 * @since 2022/1/15 16:59
 */
public class JPanelDemo {

    public static void main(String[] agrs) {
        JFrame jf = new JFrame("Java第二个GUI程序");    //创建一个JFrame对象
        jf.setBounds(300, 100, 400, 200);    //设置窗口大小和位置
        JPanel jp = new JPanel();    //创建一个JPanel对象
        JLabel jl = new JLabel("这是放在JPanel上的标签");    //创建一个标签
        jp.setBackground(Color.white);    //设置背景色
        jp.add(jl);    //将标签添加到面板
        jf.add(jp);    //将面板添加到窗口
        jf.setVisible(true);    //设置窗口可见
    }
}