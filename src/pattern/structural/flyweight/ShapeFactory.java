package pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 吴尚慧
 * @since 2022/6/26 17:14
 */
public class ShapeFactory {

    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
