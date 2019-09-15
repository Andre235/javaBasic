package day01_junit_reflect_annotation.reflect;

import day01_junit_reflect_annotation.domain.Person;

/**
 * @author : 赵静超
 * @date Date : 2019/9/15 10:27
 * @description : 获取类对象的三种方式
 */
public class ReflectDemo0 {
    /*获取class对象的三种方式
    1.Source源码阶段
        Class.forName("全类名")：将字节码文件加载进内存，返回class对象
    2.class类对象阶段
        类名.class：通过类名的属性class获取
    3.Runtime运行时阶段
        对象.getClass()：getClass()方法在Object类中定义着*/
    public static void main(String[] args) throws Exception {

        //1.Class.forName("全类名")
        Class person1 = Class.forName("day01_junit_reflect_annotation.domain.Person");
        System.out.println(person1);
        //2.类名.class
        Class person2 = Person.class;
        System.out.println(person2);
        //3.对象.getClass()
        Person person = new Person();
        Class person3 = person.getClass();
        System.out.println(person3);
    }
}
