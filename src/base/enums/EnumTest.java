package base.enums;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

/**
 * @author wsh
 * @date 2019/11/15 10:06
 */
public class EnumTest {

    public static void main(String[] args) {
        String input = "EXTRA_LARGE";
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("Size="+size);
        //缩写
        System.out.println("abbreviation="+size.getAbbreviation());
        System.out.println("size.ordinal()="+size.ordinal());
    }
}

enum Size {

    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
