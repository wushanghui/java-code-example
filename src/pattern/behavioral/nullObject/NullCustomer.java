package pattern.behavioral.nullObject;

/**
 * @author 吴尚慧
 * @since 2022/7/3 18:58
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}