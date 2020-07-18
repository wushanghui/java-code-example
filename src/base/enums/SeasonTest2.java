package base.enums;

/**
 * @author wsh
 * @date 2020/7/15 11:19
 */
public class SeasonTest2 {

    public static void main(String[] args) {
        Season2 spring = Season2.SPRING;
        Season2 summer = Season2.SUMMER;
        Season2 autumn = Season2.AUTUMN;
        Season2 winter = Season2.WINTER;
        System.out.print(spring + " ");
        System.out.print(summer + " ");
        System.out.print(autumn + " ");
        System.out.print(winter + " ");
        System.out.println();
        Season2 spring1 = Enum.valueOf(Season2.class, "SPRING");
        Season2 spring2 = Enum.valueOf(Season2.class, "SPRING1");
        System.out.println(spring1);
        System.out.println(spring1.getSeasonCode());
    }

}

/**
 * 使用enum关键字枚举类
 */
enum Season2 {

    /**
     * 1.提供当前枚举类的对象，多个对象之间用","隔开，末尾对象";"结束
     */
    SPRING("spring", "春天"),
    SUMMER("summer", "夏天"),
    AUTUMN("autumn", "秋天"),
    WINTER("winter", "冬天");

    /**
     * 2.声明Season对象的属性:private final修饰
     */
    private final String seasonCode;
    private final String seasonName;

    /**
     * 3.私有化类的构造器,并给对象属性赋值
     */
    private Season2(String seasonCode, String seasonName) {
        this.seasonCode = seasonCode;
        this.seasonName = seasonName;
    }

    /**
     * 4. 获取枚举类对象的属性
     */
    public String getSeasonCode() {
        return seasonCode;
    }

    public String getSeasonName() {
        return seasonName;
    }

}
