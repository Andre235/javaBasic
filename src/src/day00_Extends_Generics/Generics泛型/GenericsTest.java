package day00_Extends_Generics.Generics泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : 赵静超
 * @date Date : 2019/9/14 17:02
 * @description : ? 类型通配符
 */
public class GenericsTest {

    public static void getDate(List<?> data){
        System.out.println(data.get(0));
    }

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();

        name.add("彭于晏");
        age.add(30);

        getDate(name);
        getDate(age);
     }
}
