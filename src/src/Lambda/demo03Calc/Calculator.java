package Lambda.demo03Calc;

import java.util.Arrays;
import java.util.List;

/**
 * @author : 赵静超
 * @date Date : 2019/9/22 10:15
 * @description :
 */
public class Calculator {
    public static void main(String[] args) {

        func1(1, 2, new Calc() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        });

        func1(1,2,(a,b)-> a+b);
        func2();
    }

    private static void func1(int a,int b ,Calc calc) {
        int result = calc.add(a,b);
        System.out.println(result);
    }

    /**
     * lambda常用实例
     */
    private static void func2() {
        List<String> list = Arrays.asList("Natasha", "Andre", "Java", "Python");
        list.forEach(n-> System.out.println(n));
    }


}
