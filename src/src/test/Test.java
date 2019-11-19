package test;

import java.util.Optional;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

/**
 * @author : zhaojingchao
 * @date : 2019/10/31
 */
public class Test {
    public static void main(String[] args) {
        //System.out.println(func(96464351));
        whenCreateOfNullableOptional_thenOk();
    }

    private static int func(int x) {
        if(x>0){
            Integer integer = x;
            String str = integer.toString();
            StringBuilder stringBuilder = new StringBuilder(str);
            StringBuilder reverse = stringBuilder.reverse();
            String newString = reverse.toString();
            return Integer.parseInt(newString);
        }
        int absData = Math.abs(x);
        String str = Integer.toString(absData);
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();
        StringBuilder insertData = reverse.insert(0, "-");
        String newString = insertData.toString();
        return Integer.parseInt(newString);
    }

    private static void whenCreateOfNullableOptional_thenOk() {
        String name = "John";
        Optional<String> opt = Optional.ofNullable(name);
        assertEquals("John", opt.get());
    }

}

