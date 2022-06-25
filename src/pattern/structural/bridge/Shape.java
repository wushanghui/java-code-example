package pattern.structural.bridge;

/**
 * 形状抽象类
 *
 * @author 吴尚慧
 * @since 2022/6/25 18:10
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
