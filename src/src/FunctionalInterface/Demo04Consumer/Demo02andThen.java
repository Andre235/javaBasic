package FunctionalInterface.Demo04Consumer;

import java.util.function.Consumer;

/**
 * @author : 赵静超
 * @date Date : 2019/10/27 11:27
 * @description : Consumer<T>接口的默认方法 andThen可以实现连接两个接口，再对消费数据
 *                案例：
 *                     Consumer<String> con1
 *                     Consumer<String> con2
 *                     String s1 = "hello"
 *                     con1.accept(s1)
 *                     con2.accept(s1)
 *                优化：先连接两个Consumer接口，在进行消费
 *                     con1.andThen(con2).accept(s1)
 */
public class Demo02andThen {
    public static void main(String[] args) {
        funcAndThen("Hello"
                ,name-> System.out.println(name.toUpperCase())
                ,name-> System.out.println(name.toLowerCase()));
    }

    /**
     * andThen()方法实现连接两个Consumer<T>
     */
    private static void funcAndThen(String name, Consumer<String> con1,Consumer<String> con2) {
        con1.andThen(con2).accept(name);
    }
}
