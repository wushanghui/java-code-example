package base.thread;

/**
 * 此程序存在线程的安全问题：打印车票时，会出现重票、错票
 */
class Window1 implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                System.out.println(Thread.currentThread().getName() + "售票，票号为："
                        + ticket--);
            } else {
                break;
            }
        }
    }
}

public class TestWindow1 {

    public static void main(String[] args) {
        Window1 w = new Window1();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
