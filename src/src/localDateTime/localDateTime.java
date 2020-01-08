package localDateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoField;
import java.util.Date;

/**
 * @author : 赵静超
 * @date : 2019/12/17
 * @description :
 * https://blog.csdn.net/qq_27276045/article/details/100792621
 */
public class localDateTime {

    public static void main(String[] args) throws ParseException {
        //funcLocalDate();
        //date2LocalDate();
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse("2020-02-08");
        Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse("2020-02-29");
        System.out.println(isSameMonth(date1,date2));

        LocalDate localDate = LocalDate.of(2020,1,8);
        Date date = date2LocalDate(localDate);
        System.out.println(date);
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

    /**
     * @param date Date类型
     * @return LocalDate类型
     * @throws ParseException
     */
    private static LocalDate date2LocalDate(Date date) throws ParseException {
        if(date == null){
            return null;
        }
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * @param localDate LocalDate类型
     * @return Date类型
     */
    private static Date date2LocalDate(LocalDate localDate){
        if(localDate == null){
            return null;
        }
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }

    /**
     * 判断两个日期是否是同一个月
     * @param date1
     * @param date2
     */
    private static Boolean isSameMonth(Date date1, Date date2) throws ParseException {
        LocalDate localDate1 = date2LocalDate(date1);
        LocalDate localDate2 = date2LocalDate(date2);

        int year1 = localDate1.get(ChronoField.YEAR);
        int month1 = localDate1.get(ChronoField.MONTH_OF_YEAR);
        int year2 = localDate2.get(ChronoField.YEAR);
        int month2 = localDate2.get(ChronoField.MONTH_OF_YEAR);

        return year1 == year2 && month1 == month2;
    }

}
