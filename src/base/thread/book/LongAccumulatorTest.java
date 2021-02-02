package base.thread.book;

import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.LongBinaryOperator;

/**
 * @author wsh
 * @date 2021/2/1 15:45
 */
public class LongAccumulatorTest {

    public static void main(String[] args) {
        LongAdder adder = new LongAdder();
        LongAccumulator accumulator = new LongAccumulator(new LongBinaryOperator() {
            @Override
            public long applyAsLong(long left, long right) {
                return left + right;
            }
        }, 0);
    }
}
