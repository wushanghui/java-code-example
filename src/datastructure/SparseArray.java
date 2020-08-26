package datastructure;

/**
 * @author wsh
 * @date 2020-08-20 17:55
 */
public class SparseArray {

    public static void main(String[] args) {
        // 1、创建一个原始二维数组 11*11
        // 0 表示没有棋子，1表示黑子，2表示白子
        int[][] chessArray = new int[11][11];
        chessArray[1][2] = 1;
        chessArray[2][3] = 2;
        chessArray[2][2] = 1;
        System.out.println("原始二维数组：");
        for (int[] ints : chessArray) {
            for (int i : ints) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }

        // 2、将二维数组转换为稀疏数组
        // 2.1 获取原始二维数组的非0的个数
        int sum = 0;
        for (int[] ints : chessArray) {
            for (int anInt : ints) {
                if (anInt != 0) {
                    sum++;
                }
            }
        }
        // 2.2 创建稀疏数组
        int[][] sparseArr = new int[sum + 1][3];
        // 给稀疏数组赋值
        // 稀疏数组第一行，第一个元素是原始二维数组有多少行，第二个元素是原始数据有多少列，第三个元素是原始数组非0的个数
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        // 2.3 存放非0的数据
        // 从稀疏数组的第二行开始，依次存储原始数据的非0的行、列、行列所在的值
        int count = 0;
        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[i].length; j++) {
                if (chessArray[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArray[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("转换成的稀疏数组：");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
        }
        System.out.println();

        // 3、将稀疏数组还原为一个新的原始二位数组
        // 3.1 读取稀疏数组第一行来创建一个原始二维数组
        int[][] chessArrNew = new int[sparseArr[0][0]][sparseArr[0][1]];
        // 3.2 读取稀疏数组（从第二行开始），赋值给二维数组
        for (int i = 1; i < sparseArr.length; i++) {
            chessArrNew[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        System.out.println("恢复后的二维数组：");
        for (int[] ints : chessArrNew) {
            for (int i : ints) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }

    }
}
