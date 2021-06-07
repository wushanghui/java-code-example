package base.lock;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Condition;

/**
 * @author wsh
 * @date 2021/6/4 1:35 下午
 */
public class SimpleProducerConsumerModel {

    final static MyNonReentrantLock lock = new MyNonReentrantLock();
    final static Condition producerCondition = lock.newCondition();
    final static Condition consumerCondition = lock.newCondition();

    final static Queue<String> queue = new LinkedBlockingQueue<>();
    final static int queueSize = 10;

    public static void main(String[] args) {

        // 生产者
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                // 获取独占锁
                lock.lock();

                try {
                    // 队列满了，生产者线程等待
                    while (queue.size() == queueSize) {
                        producerCondition.await();
                    }

                    // 添加元素到队列
                    queue.add("element");

                    // 唤醒消费线程
                    consumerCondition.signalAll();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // 释放锁
                    lock.unlock();
                }
            }
        });

        // 消费者
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                // 获取独占锁
                lock.lock();

                try {
                    // 队列空，消费者线程等待
                    while (queue.size() == 0) {
                        consumerCondition.await();
                    }

                    // 消费一个元素
                    queue.poll();

                    // 唤醒生产线程
                    producerCondition.signalAll();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // 释放锁
                    lock.unlock();
                }
            }
        });

        // 启动线程
        producer.start();
        consumer.start();

    }

}
