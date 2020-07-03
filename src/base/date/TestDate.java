package base.date;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author wsh
 * @date 2020/5/27 10:34
 */
public class TestDate {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime of = LocalDateTime.of(now.toLocalDate(), LocalTime.MIN);
        System.out.println(of);
        LocalDateTime of2 = LocalDateTime.of(now.toLocalDate(), LocalTime.MAX);
        System.out.println(of2);
        System.out.println("---------------------------");
        System.out.println(dateToLocalDate(new Date()));
//        System.out.println(dateToLocalDate(new java.sql.Date(2019, 1,1)));
        System.out.println("--------------------------");
        System.out.println(localDateToDate(dateToLocalDate(new Date())));
        System.out.println("-----------------------------");
        String str = "1,2,3,4,5,6,7";
        String[] split = str.split(",");
        System.out.println(split.toString());
        List<String> list = new ArrayList<>();
        System.out.println("----------------------------------");
        BigDecimal bigDecimal = new BigDecimal("89.665");
        BigDecimal divide = bigDecimal.divide(new BigDecimal("100"), 4, BigDecimal.ROUND_HALF_EVEN);
        System.out.println(divide);
        bigDecimal.setScale(1);

    }

    private static LocalDate dateToLocalDate(Date date) {
        if (date == null) {
            return null;
        }
        if (date instanceof java.sql.Date) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(new Date(date.getTime()).toInstant(), ZoneId.systemDefault());
            LocalDate localDate = localDateTime.toLocalDate();
//            System.out.println(localDateTime);
//            System.out.println(localDate);
            return localDate;
        }
        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        LocalDate localDate2 = localDateTime2.toLocalDate();
//        System.out.println("localDateTime2:"+localDateTime2);
//        System.out.println(localDate2);
        return localDate2;
    }

    private static Date localDateToDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }
}
