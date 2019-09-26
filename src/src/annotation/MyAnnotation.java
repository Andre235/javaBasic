package annotation;

/**
 * @author : 赵静超
 * @date Date : 2019/9/15 11:16
 * @description : 自定义注解
 */

public @interface MyAnnotation {

    int age();
    String name() default "张三";  //定义姓名属性是，默认name为张三
    Person per(); //返回枚举类型
    String[] strs();
    /*String show2();
    Person per(); //返回枚举类型
    MyAnnotation2 myAnno();     //返回注解类型
    */
}
