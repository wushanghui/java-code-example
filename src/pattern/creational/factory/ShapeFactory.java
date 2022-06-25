package pattern.creational.factory;

/**
 * 形状工厂
 *
 * @author 吴尚慧
 * @since 2022/6/13 10:24
 */
public class ShapeFactory {

    /**
     * 使用 getShape 方法获取形状类型的对象
     *
     * @param shapeType 形状类型
     * @return 形状对象
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
