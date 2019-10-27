package Stream;

import java.util.stream.Stream;

/**
 * @author : 赵静超
 * @date Date : 2019/10/27 13:21
 * @description : filter() 将一个Stream流过滤转换为另外一个Stream流
 */
public class Demo03Filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("倪妮", "万茜", "古力娜扎", "赵丽颖");
        stream.filter(name->name.length()==2).forEach(System.out::println);
    }
}
