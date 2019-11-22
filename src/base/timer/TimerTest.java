package base.timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

/**
 * @author wsh
 * @date 2019/11/21 9:33
 */
public class TimerTest {

    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        //构造一个定时器，每隔指定的一段时间通知 listener 一次
        Timer timer = new Timer(2000, listener);
        timer.start();
        //显示一条消息和确定按钮的对话框，这个对话框将位于其parent组件的中央，如果parent为null，对话框显示在屏幕的中央
        JOptionPane.showMessageDialog(null, "退出程序？");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("嘟一声, 当前时间：" + LocalDateTime.now());
        //发出一声铃响
        Toolkit.getDefaultToolkit().beep();
    }
}
