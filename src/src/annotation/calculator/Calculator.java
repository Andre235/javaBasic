package annotation.calculator;

/**
 * @author : 赵静超
 * @date Date : 2019/9/15 15:03
 * @description : 小明定义的计算器类，利用注解的方式测试里面的方法
 */
public class Calculator {

    //加法
    @Check
    public void add(){
        System.out.println("1+0="+(1+0));
    }
    //减法
    @Check
    public void sub(){
        System.out.println("1-0="+(1-0));
    }
    //乘法
    @Check
    public void mul(){
        System.out.println("1*0="+(1*0));
    }
    //除法
    @Check
    public void div(){
        System.out.println("1/0="+(1/0));
    }

    public void show(){
        System.out.println("佛祖保佑,永无bug");

    }
}
