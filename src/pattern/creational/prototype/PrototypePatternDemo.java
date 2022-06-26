package pattern.creational.prototype;

/**
 * @author 吴尚慧
 * @since 2022/6/21 10:22
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape(1);
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape(2);
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape(3);
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
