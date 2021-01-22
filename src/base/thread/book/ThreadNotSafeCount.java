package base.thread.book;

/**
 * @author wsh
 * @date 2021/1/22 13:56
 */
public class ThreadNotSafeCount {

    private Long value;

    public Long getValue() {
        return value;
    }

    public void increase() {
        ++value;
    }
}
