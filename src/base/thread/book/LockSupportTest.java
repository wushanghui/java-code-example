package base.thread.book;

import java.util.concurrent.locks.LockSupport;

/**
 * @author wsh
 * @date 2021/2/2 16:49
 */
public class LockSupportTest {

    public static void main(String[] args) {
        System.out.println("start park!");
        // 默认是没有许可证的
        LockSupport.park();
        System.out.println("end part!");
    }
}
