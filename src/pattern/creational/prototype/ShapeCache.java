package pattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 吴尚慧
 * @since 2022/6/21 10:20
 */
public class ShapeCache {

    private static Map<Integer, Shape> SHAPE_MAP = new HashMap<>();

    public static Shape getShape(Integer shapeId) {
        Shape cachedShape = SHAPE_MAP.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId(1);
        SHAPE_MAP.put(circle.getId(), circle);

        Square square = new Square();
        square.setId(2);
        SHAPE_MAP.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId(3);
        SHAPE_MAP.put(rectangle.getId(), rectangle);
    }
}
