package Extends;

/**
 * @author : zjc
 * @date Date : 2019/9/12 21:12
 * @description
 */
public class Person2 extends SuperPerson {

    private int a;

    Person2(){
        super(200);
        System.out.println("子类2无参构造方法");
    }

    Person2(int a){
        System.out.println("子类2含参构造方法："+a);
    }

}