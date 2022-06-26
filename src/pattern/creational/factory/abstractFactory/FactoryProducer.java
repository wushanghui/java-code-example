package pattern.creational.factory.abstractFactory;

/**
 * 工厂生成器
 *
 * @author 吴尚慧
 * @since 2022/6/13 11:48
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}