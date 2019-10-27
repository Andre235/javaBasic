package FunctionalInterface.Demo04Consumer;


import java.util.function.Consumer;

/**
 * @author : 赵静超
 * @date Date : 2019/10/27 11:42
 * @description :
 */
public class Demo03Test {
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男"};
        test(arr
            ,(name)-> System.out.print("姓名："+name.split(",")[0])
            ,(age)-> System.out.println(" 年龄："+age.split(",")[1]));
    }

    private static void test(String[] arr, Consumer<String> con1,Consumer<String> con2) {
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }
}
