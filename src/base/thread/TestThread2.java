package base.thread;

/**
 * 创建多线程的方式二：通过实现的方式
 * 1.创建一个实现了Runnable接口的类
 */
class PrintNum1 implements Runnable {
    //2.实现接口的抽象方法
    @Override
    public void run() {
        // 子线程执行的代码
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class TestThread2 {

    public static void main(String[] args) {
        // 3.创建一个Runnable接口实现类的对象
        PrintNum1 p = new PrintNum1();
        // 要想启动一个多线程，必须调用start()
        // 4.将此对象作为形参传递给Thread类的构造器中，创建Thread类的对象，此对象即为一个线程
        Thread t1 = new Thread(p);
        // 5.调用start()方法：启动线程并执行run()
        // 启动线程；执行Thread对象生成时构造器形参的对象的run()方法。
        t1.start();

        //再创建一个线程
        Thread t2 = new Thread(p);
        t2.start();
    }
}
