package FunctionalInterface.Demo05Predicate;

import java.util.function.Predicate;

/**
 * @author : 赵静超
 * @date Date : 2019/10/27 11:53
 * @description : test()对某种数据类型进行判断，返回Boolean
 */
public class Demo01Predicate {
    public static void main(String[] args) {
        String s = "abcde";
        boolean b = checkString(s, s1 -> s1.length() > 5);
        System.out.println(b);
    }

    private static boolean checkString(String str, Predicate<String> pre) {
        return pre.test(str);
    }
}
