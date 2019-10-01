package Lambda.demo03Calc;

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

    }

    private static void func1(int a,int b ,Calc calc) {
        int result = calc.add(a,b);
        System.out.println(result);
    }

}
