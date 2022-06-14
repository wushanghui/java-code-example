package pattern.creational.factory.abstractFactory;

import pattern.creational.factory.Circle;
import pattern.creational.factory.Rectangle;
import pattern.creational.factory.Shape;
import pattern.creational.factory.Square;

/**
 * @author 吴尚慧
 * @since 2022/6/13 11:47
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
