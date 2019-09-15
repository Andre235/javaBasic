package day01_junit_reflect_annotation.reflect;

import day01_junit_reflect_annotation.domain.Person;

import java.lang.reflect.Constructor;

/**
 * @author : 赵静超
 * @date Date : 2019/9/14 20:27
 * @description : 反射实例获取构造方法
 */
public class ReflectDemo2 {

    public static void main(String[] args) throws Exception {
        //0.获取person类对象
        Class personClass = Person.class;
        //1.获取person类对象的构造方法
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //通过获取的构造方法创建对象
        Object person = constructor.newInstance("马云", 50);
        System.out.println(person);

        System.out.println("\n------------创建无参构造实例---------");
        //1.获取person类对象的构造方法
        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        //通过获取的构造方法创建对象
        Object person1 = constructor1.newInstance();
        System.out.println(person1);

        //通过无参构造方法创建实例的简化方法
        Object o = personClass.newInstance();
        System.out.println(o);

    }

}
