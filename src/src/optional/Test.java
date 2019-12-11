package optional;

import java.util.Optional;

/**
 * @author : 赵静超
 * @date : 2019/12/2
 * @description :
 */
public class Test {

    public static void main(String[] args) {
        fun();
    }

    private static String fun() {
        String name = null;
        return Optional.ofNullable(name).orElse("匿名用户");
    }
}
