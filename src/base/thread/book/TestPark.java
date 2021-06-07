package base.thread.book;

import java.util.concurrent.locks.LockSupport;

/**
 * @author wsh
 * @date 2021/2/6 4:49 下午
 */
public class TestPark {

    public void testPark() {
        LockSupport.park(this);
    }

    public static void main(String[] args) {
        TestPark testPark = new TestPark();
        testPark.testPark();
    }
}
