package localDateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * @author : 赵静超
 * @date : 2019/12/17
 * @description :  //https://blog.csdn.net/qq_27276045/article/details/100792621
 */
public class localDateTime {

    public static void main(String[] args) {
        funcLocalDate();
    }

    private static void funcLocalDate() {
        // 创建 LocalDate
        // 获取当前年月日
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        // 构造指定的年月日
        LocalDate localDate1 = LocalDate.of(2019, 9, 12);
        System.out.println(localDate1);
        // 获取年、月、日、星期几
        int year = localDate.getYear();
        int year1 = localDate.get(ChronoField.YEAR);
        Month month = localDate.getMonth();
        int month1 = localDate.get(ChronoField.MONTH_OF_YEAR);
        int day = localDate.getDayOfMonth();
        int day1 = localDate.get(ChronoField.DAY_OF_MONTH);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int dayOfWeek1 = localDate.get(ChronoField.DAY_OF_WEEK);
        System.out.println(year+" "+month+" "+day+" "+dayOfWeek);
        System.out.println(year1+" "+month1+" "+day1+" "+dayOfWeek1);
    }
}
