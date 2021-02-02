package base.thread.book;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author wsh
 * @date 2021/2/2 11:38
 */
public class CopyOnWriteArrayListTest {

    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList();
        arrayList.add("hello");
        arrayList.add("world");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
