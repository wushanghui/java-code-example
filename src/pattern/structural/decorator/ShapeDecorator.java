package pattern.structural.decorator;

/**
 * 形状装饰器抽象类
 *
 * @author 吴尚慧
 * @since 2022/6/26 13:12
 */
public abstract class ShapeDecorator implements Shape {
    /**
     * 装饰器形状
     */
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
