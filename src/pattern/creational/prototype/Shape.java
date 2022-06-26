package pattern.creational.prototype;

/**
 * 形状
 *
 * @author 吴尚慧
 * @since 2022/6/21 10:15
 */
public abstract class Shape implements Cloneable {

    private Integer id;
    protected String type;

    /**
     * 画
     */
    public abstract void draw();

    public String getType(){
        return type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
