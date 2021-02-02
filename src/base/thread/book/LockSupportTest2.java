package base.thread.book;

import java.util.concurrent.locks.LockSupport;

/**
 * @author wsh
 * @date 2021/2/2 16:49
 */
public class LockSupportTest2 {

    public static void main(String[] args) {
        System.out.println("start park!");
        // 使当前线程获取到许可证
        LockSupport.unpark(Thread.currentThread());
        LockSupport.park();
        System.out.println("end part!");
    }
}
