package Stream;

import java.util.stream.Stream;

/**
 * @author : 赵静超
 * @date Date : 2019/10/27 13:10
 * @description : void forEach(Consumer<T> con)
 *                forEach() 方法接收函数式接口，是一个终结方法
 */
public class Demo02forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Natasha", "Andre", "Python");
        stream.forEach(name-> System.out.println(name));


        String string = "自律者自由";
        String s = new StringBuffer(string).reverse().toString();
        System.out.println(s);

        char[] chars = s.toCharArray();
        Stream<char[]> chars1 = Stream.of(chars);
        chars1.forEach(System.out::println);


    }
}
