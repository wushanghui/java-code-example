package leetcode.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wsh
 * @date 2020-09-01 16:52
 */
public class Foo1114 {

    private AtomicInteger first = new AtomicInteger(0);
    private AtomicInteger second = new AtomicInteger(0);

    public void first() {
        while (first.get() != 1) {

        }
        int i = first.incrementAndGet();
        int i1 = first.addAndGet(1);
    }

}
