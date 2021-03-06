package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-24 15:41
 */
public class InstructionReorderingTest {

    private static int num = 0;
    private static boolean ready = false;

    public static class ReadThread extends Thread {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                if (ready) { // (1)
                    System.out.println(num + num);// (2)
                }
                System.out.println("read thread...");
            }
        }
    }

    public static class WriteThread extends Thread {
        @Override
        public void run() {
            num = 2; // (3)
            ready = true; // (4)
            System.out.println("write thread set over...");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadThread rt = new ReadThread();
        rt.start();

        WriteThread wt = new WriteThread();
        wt.start();

        Thread.sleep(10);
        rt.interrupt();
        System.out.println("main thread over");
    }
}

