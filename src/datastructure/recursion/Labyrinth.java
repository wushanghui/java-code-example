package datastructure.recursion;

/**
 * @author wsh
 * @date 2020/9/15 5:17 下午
 * 迷宫问题，使用递归来解决
 */
public class Labyrinth {

    private static int count = 0;

    public static void main(String[] args) {
        // 用二位数组来模拟迷宫(8X7)
        int[][] data = new int[8][7];
        // 1表示墙
        // 上下设置为墙
        for (int i = 0; i < data[0].length; i++) {
            data[0][i] = 1;
            data[7][i] = 1;
        }
        // 左右设置为墙
        for (int i = 0; i < data.length; i++) {
            data[i][0] = 1;
            data[i][6] = 1;
        }
        // 设置挡板
        data[3][1] = 1;
        data[3][2] = 1;
        System.out.println("迷宫地图：");
        for (int[] datum : data) {
            for (int i : datum) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        // 使用递归回溯给小球找路
        //setWay(data, 1,1);
        setWay2(data, 1,1);
        System.out.println("走过的 迷宫地图：");
        for (int[] datum : data) {
            for (int i : datum) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("走路次数：" + count);
    }

    /**
     * 使用递归回溯来给小球找路
     * 说明：
     * 1、map 地图
     * 2、i，j表示从哪一个位置出发（1，1）为开始位置
     * 3、map[6][5] 是终点位置，到这个位置，表示路走通了
     * 4、map[i][j] 为0 表示没有走过，为1 表示墙，为2 表示已经走过
     * 5、走迷宫策略：下 -> 右 -> 上 -> 左
     */
    public static boolean setWay(int[][] map, int i, int j) {
        count++;
        if (map[6][5] == 2) {
            // 路走通了
            return true;
        } else {
            if (map[i][j] == 0) {
                // 假设能走通
                map[i][j] = 2;
                if (setWay(map, i + 1, j)) {
                    // 往下走
                    return true;
                } else if (setWay(map, i, j + 1)) {
                    // 往右走
                    return true;
                } else if (setWay(map, i - 1, j)) {
                    // 往上走
                    return true;
                } else if (setWay(map, i, j - 1)) {
                    // 往左走
                    return true;
                } else {
                    // 死路，走不通
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    /**
     * 使用递归回溯来给小球找路
     * 说明：
     * 1、map 地图
     * 2、i，j表示从哪一个位置出发（1，1）为开始位置
     * 3、map[6][5] 是终点位置，到这个位置，表示路走通了
     * 4、map[i][j] 为0 表示没有走过，为1 表示墙，为2 表示已经走过
     * 5、走迷宫策略：上 -> 左 -> 下 -> 右
     */
    public static boolean setWay2(int[][] map, int i, int j) {
        count++;
        if (map[6][5] == 2) {
            // 路走通了
            return true;
        } else {
            if (map[i][j] == 0) {
                // 假设能走通
                map[i][j] = 2;
                if (setWay(map, i - 1, j)) {
                    // 往上走
                    return true;
                } else if (setWay(map, i, j - 1)) {
                    // 往左走
                    return true;
                } else if (setWay(map, i + 1, j)) {
                    // 往下走
                    return true;
                } else if (setWay(map, i, j + 1)) {
                    // 往右走
                    return true;
                } else {
                    // 死路，走不通
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
