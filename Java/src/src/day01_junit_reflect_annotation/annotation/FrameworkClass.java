package day01_junit_reflect_annotation.annotation;

import java.lang.reflect.Method;

/**
 * @author : 赵静超
 * @date Date : 2019/9/14 21:39
 * @description : 自定义注解，实现框架的设计
 *
 */
@Pro(className = "day01_junit_reflect_annotation.annotation.Demo1",methodName = "show")
public class FrameworkClass {

    public static void main(String[] args) throws Exception {
        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<FrameworkClass> frameworkClassClass = FrameworkClass.class;
        //2.获取描述的注解对象
        //实际上该代码在内存中生成了一个实现该注解接口的类
        Pro pro = frameworkClassClass.getAnnotation(Pro.class);
        //3.调用注解对象的抽象方法，获取返回值
        String className = pro.className();
        String methodName = pro.methodName();
        System.out.println(className);
        System.out.println(methodName);

        //3.加载该类进内存
        Class Person = Class.forName(className);
        //4.创建该类对象
        Object personObj = Person.newInstance();
        //5.获取该类方法
        Method eat = Person.getMethod(methodName);
        //6.执行方法
        eat.invoke(personObj);

    }
}
