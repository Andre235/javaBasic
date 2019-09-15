package day00_Extends_Generics.Extends;

/**
 * @author : zjc
 * @date Date : 2019/9/12 21:14
 * @description
 */
public class TestClass {
    public static void main(String[] args) {
        System.out.println("---------person1类继承---------");
        Person1 person1 = new Person1();
        Person1 person12 = new Person1(100);
        System.out.println("---------person2类继承---------");
        Person2 person2 = new Person2();
        Person2 person21 = new Person2(200);
    }
}
