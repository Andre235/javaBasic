package Stream;

import java.util.stream.Stream;

/**
 * @author : 赵静超
 * @date Date : 2019/10/27 13:32
 * @description : map() 将一个Stream流映射为另一个Stream流
 */
public class Demo04Map {
    public static void main(String[] args) {
        //将字符串类型的整数映射为Integer类型的整数
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        stream.map(e-> Integer.parseInt(e)).forEach(System.out::println);
    }
}
