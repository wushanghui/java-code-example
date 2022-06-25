package pattern.structural.bridge;

/**
 * 红色的圆
 *
 * @author 吴尚慧
 * @since 2022/6/25 18:06
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("画圆[ 颜色: 红色, 半径: "                + radius + ", x: " + x + ", " + y + "]");
    }
}
