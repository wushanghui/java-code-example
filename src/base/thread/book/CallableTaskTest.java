package base.thread.book;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author wsh
 * @date 2021-01-14 10:56
 */
public class CallableTaskTest {

    public static class CallableTask implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println(Thread.currentThread().getName() + ": 我是一个子线程");
            return "hello";
        }
    }

    public static void main(String[] args) {
        // 创建异步任务
        FutureTask<String> futureTask = new FutureTask<>(new CallableTask());
        // 启动线程
        new Thread(futureTask).start();

        String result = null;
        try {
            result = futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
