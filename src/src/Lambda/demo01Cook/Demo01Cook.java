package Lambda.demo01Cook;

/**
 * @author : 赵静超
 * @date Date : 2019/9/22 9:07
 * @description : 定义一个抽象方法，内含一个唯一的抽象方法，无参数且无返回值
 *                使用Lambda标准格式调用该方法，打印出吃饭了字样
 */
public class Demo01Cook {
    public static void main(String[] args) {
        //调用invokeFunc方法参数是cook接口，传递cook接口的匿名内部类
        invokeFunc(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了！");
            }
        });

        //使用lambda表达式，简化匿名内部类代码
        invokeFunc(()-> System.out.println("吃饭了嘻嘻"));
    }



    //定义一个方法，参数传递cook接口，方法内部调用接口的makeFood方法
    public static void invokeFunc(Cook cook){
        cook.makeFood();
    }
}
