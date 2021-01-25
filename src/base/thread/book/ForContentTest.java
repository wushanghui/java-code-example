package base.thread.book;

import sun.lwawt.macosx.CSystemTray;

/**
 * @author wsh
 * @date 2021/1/25 2:51 下午
 */
public class ForContentTest {

    static final int LINE_NUM = 1024;
    static final int COLUMN_NUM = 1024;

    public static void main(String[] args) {
        long[][] array = new long[LINE_NUM][COLUMN_NUM];

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * 2 + j;
            }
        }

        long endTime = System.currentTimeMillis();
        long cacheTime = endTime - startTime;
        System.out.println("cache time: " + cacheTime);
    }

}
