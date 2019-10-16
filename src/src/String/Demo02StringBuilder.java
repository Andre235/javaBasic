package String;

/**
 * @author : 赵静超
 * @date Date : 2019/10/4 15:12
 * @description : StringBuilder.append()方法可以添加任意类型的数据
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hello StringBuilder");
        System.out.println(builder);

        StringBuilder builder1 = new StringBuilder();
        builder1.append(1).append(true).append("ac").append(8.8); //链式编程
        System.out.println(builder1);

        exchange();
    }

    //String类和StringBuilder类的相互转换
    private static void exchange() {
        String str = "hello";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append("world");
        System.out.println("stringBuilder:"+stringBuilder);

        String string = stringBuilder.toString();
        System.out.println("string:"+string);
    }
}
