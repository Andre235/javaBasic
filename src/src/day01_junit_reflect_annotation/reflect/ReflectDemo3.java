package day01_junit_reflect_annotation.reflect;

import day01_junit_reflect_annotation.domain.Person;

import java.lang.reflect.Method;

/**
 * @author : 赵静超
 * @date Date : 2019/9/14 20:27
 * @description : 反射实例获取成员方法
 */
public class ReflectDemo3 {

    public static void main(String[] args) throws Exception {
        //0.获取person类对象
        Class personClass = Person.class;
        //1.获取person类对象中指定名称的无参方法
        Method eatMethod = personClass.getMethod("eat");
        Person person = new Person();
        //执行无参方法
        eatMethod.invoke(person);

        System.out.println("\n------------------");
        //1.获取person类对象中指定名称的有参方法
        Method eatMethod2 = personClass.getMethod("eat",String.class);
        //执行无参方法
        eatMethod2.invoke(person,"意大利面");

        System.out.println("\n------------------");
        //获取所有方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            //获取方法名称
            String name = method.getName();
            System.out.println(name);
        }

        //获取类名（全类名）
        String className = personClass.getName();
        System.out.println(className);
    }

}
