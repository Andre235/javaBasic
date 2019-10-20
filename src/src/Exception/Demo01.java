package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : 赵静超
 * @date Date : 2019/10/20 10:44
 * @description : 所有异常类继承自Throwable类(子类Error类、Exception类)
 *                编译期异常、运行时异常
 */
public class Demo01 {
    public static void main(String[] args)  {
        func1();
        func2();
        funcError();
    }

    /**
     * 编译期出现异常，即编译时就没有通过
     */
    private static void func1() {
        try {
            //格式化日期
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            //把字符串格式的日期解析为Date类型的日期
            Date date = dateFormat.parse("1997-0201");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("该方法执行完毕！");
    }

    /**
     * 运行时异常，编译通过，运行时抛出的异常
     */
    private static void func2() {
        try {
            int[] arr = new int[3];
            System.out.println(arr[3]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("运行时异常方法执行完毕");
    }

    /**
     * 错误类
     * 想要修改错误必须修改源代码
     */
    private static void funcError() {

        try {
            int[] arr = new int[1024*1024*1024];
            System.out.println("后续代码");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
