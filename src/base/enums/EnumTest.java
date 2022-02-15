package base.enums;

/**
 * @author wsh
 * @date 2019/11/15 10:06
 */
public class EnumTest {

    public static void main(String[] args) {
        String input = "EXTRA_LARGE";
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("Size=" + size);
        //缩写
        System.out.println("abbreviation=" + size.getAbbreviation());
        System.out.println("size.ordinal()=" + size.ordinal());
        Size small = Size.SMALL;
        System.out.println(small.getSizeInfo()); // 我是一个尺寸枚举类
        Size medium = Size.MEDIUM;
        System.out.println(medium.getSizeInfo()); // 我是 M 号
    }
}

interface SizeInfoInterface {
    String getSizeInfo();
}

enum Size implements SizeInfoInterface {

    SMALL("S"),
    MEDIUM("M") {
        /**
         * 若枚举值有不同的行为方式，可以自己实现接口的方法
         */
        @Override
        public String getSizeInfo() {
            return "我是 M 号";
        }
    },
    LARGE("L"),
    EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * 所有的枚举值都有相同的行为方式，可以这么实现接口的方法
     */
    @Override
    public String getSizeInfo() {
        return "我是一个尺寸枚举类";
    }
}
