package day02_lambda.demo01;

/**
 * @author : 赵静超
 * @date Date : 2019/9/16 14:00
 * @description : 使用Lambda表达式调用Cook接口中的makeFood方法
 */
public class Demo1 {
    public static void main(String[] args) {
        //使用匿名
    }

    public static void invokeCooke(Cook cook){
        cook.makeFood();
    }
}
