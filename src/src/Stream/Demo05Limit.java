package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author : 赵静超
 * @date Date : 2019/10/27 13:49
 * @description :
 */
public class Demo05Limit {
    public static void main(String[] args) {
        String[] list =  {"java","python","c","c++"};
        Stream<String> stream = Arrays.stream(list);
        stream.limit(3).forEach(System.out::println);
    }


}
