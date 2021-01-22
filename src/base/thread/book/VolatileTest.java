package base.thread.book;

/**
 * @author wsh
 * @date 2021/1/22 11:30
 */
public class VolatileTest {

    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        Thread threadA = new Thread(td);
        threadA.start();

        while (true) {
            if (td.getFlag()) {
                System.out.println("main thread 看到了 子线程 threadA 改变后的flag的标志：" + td.getFlag());
                break;
            }
        }
    }
}

class ThreadDemo implements Runnable {

    private volatile boolean flag = false;

    @Override
    public void run() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        flag = true;

    }

    public boolean getFlag() {
        return flag;
    }

}
