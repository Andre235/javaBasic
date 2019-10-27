package FunctionalInterface.Demo04Consumer;


import java.util.function.Consumer;

/**
 * @author : 赵静超
 * @date Date : 2019/10/27 11:07
 * @description : Consumer<T> 消费型接口，方法传递什么泛型就消费什么类型的数据
 *                accept()方法实现
 */
public class Demo01Consumer {
    public static void main(String[] args) {
        //消费方式：直接输出字符串
        funcConsumer("倪妮",name-> System.out.println(name));

        //消费方式：反转字符串
        funcConsumer("倪妮",name-> {
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName);
        });
    }

    /**
     * Consumer<T>函数式接口，通过accept()方法用于消费泛型指定类型的数据 (可以通过Lambda表达式实现)
     */
    private static void funcConsumer(String name, Consumer<String> con) {
        con.accept(name);
    }
}
