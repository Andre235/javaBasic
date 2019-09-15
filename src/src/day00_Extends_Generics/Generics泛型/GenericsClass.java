package day00_Extends_Generics.Generics泛型;

/**
 * @author : 赵静超
 * @date Date : 2019/9/14 16:50
 * @description : 泛型类
 */
public class GenericsClass <T> {
    private T t;
    public void add(T t){this.t=t;}
    public T get(){return t;}

    public static void main(String[] args) {
        GenericsClass<Integer> intBox = new GenericsClass<>();
        GenericsClass<String> stringBox = new GenericsClass<>();
        intBox.add(new Integer(10));
        stringBox.add(new String("菜鸟教程"));

        System.out.println(intBox.get());
        System.out.println(stringBox.get());

    }
}
