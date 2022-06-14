package pattern.creational.factory.abstractFactory;

import pattern.creational.factory.Shape;

/**
 * @author 吴尚慧
 * @since 2022/6/13 11:46
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
