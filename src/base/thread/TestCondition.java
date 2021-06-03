package base.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wsh
 * @date 2021/6/3 16:03
 * 伪代码，看源码需要
 */
public class TestCondition {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        lock.lock();
        try {
            System.out.println("begin wait");
            condition.await();
            System.out.println("end wait");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        lock.lock();
        try {
            System.out.println("begin signal");
            condition.signal();
            System.out.println("end signal");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
