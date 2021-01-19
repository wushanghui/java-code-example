package base.thread.book;

/**
 * @author wsh
 * @date 2021-01-17 15:20
 */
public class ThreadLocalTest {

    static ThreadLocal<String> localVariable = new ThreadLocal<>();

    /**
     * 打印函数
     * @param str str
     */
    static void print(String str) {
        // 打印当前线程本地内存中 localVariable 变量的值
        System.out.println(str + ":" + localVariable.get());
        // 清除当前线程本地内存中的 localVariable 变量
         localVariable.remove();
    }

    public static void main(String[] args) {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                // 设置线程 threadA 中本地变量 localVariable 的值
                localVariable.set("threadA local variable");
                print("threadA");
                System.out.println("threadA remove after" + ":" + localVariable.get());
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                // 设置线程 threadB 中本地变量 localVariable 的值
                localVariable.set("threadB local variable");
                print("threadB");
                System.out.println("threadB remove after" + ":" + localVariable.get());
            }
        });

        threadA.start();
        threadB.start();
    }
}
