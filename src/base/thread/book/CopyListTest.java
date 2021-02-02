package base.thread.book;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author wsh
 * @date 2021/2/2 16:09
 */
public class CopyListTest {

    private static volatile CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        arrayList.add("I ");
        arrayList.add("love ");
        arrayList.add("you ");
        arrayList.add("china!");

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                arrayList.set(0, "We ");
                arrayList.remove(3);
            }
        });

        // 在线程启动之前获取迭代器
        Iterator<String> iterator = arrayList.iterator();

        // 启动线程
        threadA.start();

        // 等子线程执行结束
        threadA.join();

        // 迭代元素
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
