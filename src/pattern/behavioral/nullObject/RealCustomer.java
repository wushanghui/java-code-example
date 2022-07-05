package pattern.behavioral.nullObject;

/**
 * @author 吴尚慧
 * @since 2022/7/3 18:57
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
