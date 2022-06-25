package pattern.structural.bridge;

/**
 * 画（桥接的接口）
 *
 * @author 吴尚慧
 * @since 2022/6/25 18:05
 */
public interface DrawAPI {

    /**
     * 画圆接口
     *
     * @param radius 半径
     * @param x      x坐标
     * @param y      y坐标
     */
    public void drawCircle(int radius, int x, int y);
}
