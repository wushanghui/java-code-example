package pattern.structural.bridge;

/**
 * @author 吴尚慧
 * @since 2022/6/25 18:11
 */
public class Circle extends Shape {
    /**
     * x坐标
     * y坐标
     * 半径
     */
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
