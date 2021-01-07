package base.io.objectStream;

/**
 * @author wsh
 * @date 2021-01-06 19:57
 */
public class Manager extends Employee {

    /**
     * 秘书
     */
    private Employee secretary;

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        secretary = null;
    }

    public void setSecretary(Employee s) {
        secretary = s;
    }

    @Override
    public String toString() {
        return super.toString() + "[secretary=" + secretary + "]";
    }
}
