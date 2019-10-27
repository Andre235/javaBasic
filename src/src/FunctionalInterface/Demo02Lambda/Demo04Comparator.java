package FunctionalInterface.Demo02Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author : 赵静超
 * @date Date : 2019/10/27 9:05
 * @description : 方法的返回值类型是一个函数式接口，可以用Lambda实现
 */
public class Demo04Comparator {
    public static void main(String[] args) {
        //按照字符串的长度进行降序排序
        String[] arr = {"aa","dddddd","c","bbb"};
        //输出排序前的字符串
        System.out.println(Arrays.toString(arr));

        //按照字符串长度进行降序排序
        Arrays.sort(arr,getComparator2());
        //输出排序后的字符串
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 方法的返回值类型是一个接口，可以返回匿名内部类方式实现
     * 返回一个逆序排序器
     * @return
     */
    private static Comparator<String> getComparator1() {
        return new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.length()-s1.length();
            }
        };
    }

    /**
     * 方法的类型是一个函数式接口，可以返回Lambda实现
     * 参数的数据类型是可以省略的
     * @return
     */
    private static Comparator<String> getComparator2() {
        return (s1, s2)->s2.length()-s1.length();
    }
}
