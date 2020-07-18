package base.enums;

/**
 * @author jue
 * @date 2020/7/14 22:53
 * @describe
 */
public class SeasonTest {

    public static void main(String[] args) {
        Season spring = Season.SPRING;
        Season summer = Season.SUMMER;
        Season autumn = Season.AUTUMN;
        Season winter = Season.WINTER;
        System.out.println(spring);
        System.out.println(summer);
        System.out.println(autumn);
        System.out.println(winter);
    }

}

/**
 * 自定义枚举类
 */
class Season{

    /**
     * 1.声明Season对象的属性:private final修饰
     */
    private final String seasonCode;
    private final String seasonName;

    /**
     * 2.私有化类的构造器,并给对象属性赋值
     */
    private Season(String seasonCode, String seasonName) {
        this.seasonCode = seasonCode;
        this.seasonName = seasonName;
    }

    /**
     * 3.提供当前枚举类的多个对象：public static final的
     */
    public static final Season SPRING = new Season("spring","春天");
    public static final Season SUMMER = new Season("summer","夏天");
    public static final Season AUTUMN = new Season("autumn","秋天");
    public static final Season WINTER = new Season("winter","冬天");

    /**
     * 4. 获取枚举类对象的属性
     */
    public String getSeasonCode() {
        return seasonCode;
    }
    public String getSeasonName() {
        return seasonName;
    }

    /**
     * 5. 提供toString()
     */
    @Override
    public String toString() {
        return "Season{" +
                "seasonCode='" + seasonCode + '\'' +
                ", seasonName='" + seasonName + '\'' +
                '}';
    }
}
