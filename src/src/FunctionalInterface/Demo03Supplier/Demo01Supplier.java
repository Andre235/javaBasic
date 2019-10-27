package FunctionalInterface.Demo03Supplier;

import java.util.function.Supplier;

/**
 * @author : 赵静超
 * @date Date : 2019/10/27 9:33
 * @description : 函数式接口Supplier<T> 接口内传递什么类型的数据，接口就返回什么类型的数据
 */
public class Demo01Supplier {
    public static void main(String[] args) {
        String string = getString(() -> "胡歌");
        System.out.println(string);
    }

    private static String getString(Supplier<String> sup) {
        return sup.get();
    }
}
