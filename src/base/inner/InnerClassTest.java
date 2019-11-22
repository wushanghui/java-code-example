package base.inner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

/**
 * @author wsh
 * @date 2019/11/22 14:58
 */
public class InnerClassTest {

    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        //显示一条消息和确定按钮的对话框，这个对话框将位于其parent组件的中央，如果parent为null，对话框显示在屏幕的中央
        JOptionPane.showMessageDialog(null, "退出程序？");
        System.exit(0);
    }
}

/**
 * 语音时钟
 */
class TalkingClock {

    /**
     * 间隔
     */
    private int interval;
    /**
     * 提示音
     */
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        ActionListener listener = new TimePrinter();
        //构造一个定时器，每隔指定的一段时间通知 listener 一次
        Timer timer = new Timer(interval, listener);
        timer.start();
    }

    public class TimePrinter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("嘟一声, 当前时间：" + LocalDateTime.now());
            if (beep) {
                //发出一声铃响
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
