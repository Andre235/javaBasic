package day00_Extends_Generics.Extends;

/**
 * @author : zjc
 * @date Date : 2019/9/12 21:10
 * @description
 */
public class Person1 extends SuperPerson {

    private int a;

    Person1(){
        System.out.println("子类1无参构造方法");
    }

    Person1(int a){
        //父类构造方法必须第一行
        super(100);
        System.out.println("子类1含参构造方法："+a);
    }

}
