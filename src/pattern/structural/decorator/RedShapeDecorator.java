package pattern.structural.decorator;

/**
 * 红色边框装饰器实现类
 *
 * @author 吴尚慧
 * @since 2022/6/26 13:16
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    /**
     * 红色边界
     */
    private void setRedBorder(Shape decoratedShape){
        System.out.println("边框颜色：红色");
    }
}
