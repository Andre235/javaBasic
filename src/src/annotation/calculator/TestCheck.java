package annotation.calculator;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Method;


/**
 * @author : 赵静超
 * @date Date : 2019/9/15 15:18
 * @description : 通过注解机制，设计一个简单的测试框架
 * 当主方法执行后，会自动执行被检测的所有方法(添加@check注解的方法)，判断是否有异常，并生成一个异常记录文件
 */
public class TestCheck {

    public static void main(String[] args) throws Exception {

        //获取类对象 类名.class与

        int number=0; //记录异常出现的次数
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bug.txt"));

        //1.创建Calculator对象
        Calculator calculator = new Calculator();
        //2.获取该对象的字节码文件(类对象)
        Class calculatorClass = calculator.getClass();
        //3.获取所有方法
        Method[] methods = calculatorClass.getMethods();
        for (Method method : methods) {
            //4.判断是否有注解修饰
            if(method.isAnnotationPresent(Check.class)){
                //5.有则执行
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    //6.捕获异常
                    //e.printStackTrace();
                    number++;
                    bufferedWriter.write(method.getName()+"方法出现异常");
                    bufferedWriter.newLine();
                    bufferedWriter.write("出现异常的名称:"+e.getCause().getClass().getSimpleName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("出现异常的原因："+e.getCause().getMessage());
                    bufferedWriter.newLine();
                    bufferedWriter.write("----------------");
                    bufferedWriter.newLine();
                }
            }
        }
        bufferedWriter.write("本次测试一共出现了"+number+"次异常");
        bufferedWriter.flush();        //刷新
        bufferedWriter.close();        //关闭
    }

}
