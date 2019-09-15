package day01_junit_reflect_annotation.reflect;

import day01_junit_reflect_annotation.domain.Person;

import java.lang.reflect.Field;

/**
 * @author : 赵静超
 * @date Date : 2019/9/14 20:27
 * @description : 反射实例获取成员变量
 */
public class ReflectDemo1 {

    public static void main(String[] args) throws Exception {
        //0.获取person类对象
        Class personClass = Person.class;
        //1.获取person类对象的成员变量 (public修饰的成员变量)
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("-----------------------");
        //获取名字为a的成员变量
        Field a = personClass.getField("a");
        //获取成员变量a的值
        Person person = new Person();
        Object value = a.get(person);
        System.out.println(value);
        //设置成员变量a的值
        a.set(person,"Hacker");
        System.out.println(person);

        System.out.println("-----------------------");
        //获取所有成员变量，不考虑修饰符权限
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        //获取私有成员变量d的值
        Field d = personClass.getDeclaredField("d");
        //忽略访问修饰符的安全检查
        d.setAccessible(true);//暴力反射
        Object value2 = d.get(person);
        System.out.println(value2);
    }

}
