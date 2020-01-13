package calendar;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author : zhaojingchao
 * @date : 2019/12/12
 * @description :
 */
public class Test {

    public static void main(String[] args) {
//        Date beginDayOfToday = getBeginDayOfToday();
//        Date beginDayOfYesterday = getBeginDayOfYesterday();
//
//        System.out.println(addDaysForDate(beginDayOfToday,-30));

//
//        Date startDate = new Date(2019,12,30);
//        Date endDate = new Date(2019,12,31);
//
//        Integer dateDiff = getDateDiff(startDate,endDate);
//        System.out.println(dateDiff);

//        System.out.println("获取当月第一天");
//        System.out.println(getFirstDayByMonth());
//
//        System.out.println("获取本周第一天");
//        System.out.println(getTimesWeekmorning());

        calc();
    }

    public static Date getBeginDayOfToday() {
        return getBeginDay(new Date());
    }

    public static Date getBeginDay(Date date) {
        Calendar start = Calendar.getInstance();
        start.setTime(date);
        start.set(Calendar.HOUR_OF_DAY, 0);
        start.set(Calendar.MINUTE, 0);
        start.set(Calendar.SECOND, 0);
        start.set(Calendar.MILLISECOND, 0);
        return start.getTime();
    }

    /**
     * 获取昨天开始时间
     *
     * @return
     */
    public static Date getBeginDayOfYesterday() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getBeginDayOfToday());
        cal.add(Calendar.DAY_OF_MONTH, -1);
        return cal.getTime();
    }

    /**
     * 获得日期加几天
     * @return
     */
    public static Date addDaysForDate(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }
    /**
     * 获取两个日期之间的天数差
     */
    public static Integer getDateDiff(Date startDate, Date endDate) { //

        Date date = startDate;
        int diff = 0;
        //用Calendar 进行日期比较判断
        Calendar cd = Calendar.getInstance();
        while (date.getTime() <= endDate.getTime()) {
            diff++;
            cd.setTime(date);
            //增加一天 放入集合
            cd.add(Calendar.DATE, 1);
            date = cd.getTime();
        }
        return diff;
    }

    /**
     * 获得当前的第一天
     *
     * @return
     */
    public static Date getFirstDayByMonth() {
        //获取当前日期
        Calendar firstTimeOfMonth = Calendar.getInstance();
        //设置为1号,当前日期既为本月第一天
        firstTimeOfMonth.set(Calendar.DAY_OF_MONTH, 1);
        firstTimeOfMonth.set(Calendar.HOUR_OF_DAY, 0);
        firstTimeOfMonth.set(Calendar.MINUTE, 0);
        firstTimeOfMonth.set(Calendar.SECOND, 0);
        firstTimeOfMonth.set(Calendar.MILLISECOND, 0);
        return firstTimeOfMonth.getTime();

    }

    // 获得本周一0点时间
    public static Date getTimesWeekmorning() {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return cal.getTime();
    }

    public static void  calc(){
        int[] arr = new int[]{2,30,30,12};
        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j <= i; j++) {
                 temp += arr[j];
            }
            arr1[i] = temp;
        }
        for (int i : arr1) {
            System.out.println(i);
        }
        System.out.println(arr1.length);
    }

}
