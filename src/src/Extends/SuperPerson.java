package Extends;

/**
 * @author : zjc
 * @date Date : 2019/9/12 21:06
 * @description 父类
 */
public class SuperPerson {

    private int a ;

    SuperPerson(){
        System.out.println("父类无参构造方法");
    }

    SuperPerson(int a){
        System.out.println("父类含参构造方法："+a);
    }

}
