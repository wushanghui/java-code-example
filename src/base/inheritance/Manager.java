package base.inheritance;

/**
 * @author wsh
 * @date 2019-11-13 22:40
 */
public class Manager extends Employee {

    /**
     * 奖金
     */
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
