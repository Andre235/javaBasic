package FunctionalInterface.Demo01FunctionalInterface;

/**
 * @author : 赵静超
 * @date Date : 2019/10/26 22:12
 * @description : 函数式接口的使用：方法的参数、方法返回值
 */
public class Demo {
    public static void main(String[] args) {

        //方法的参数是一个接口，可以传入接口的实现类
        show(new MyFuncInterfaceImpl());

        //方法的参数是一个接口，可以传入匿名内部类实现
        show(new MyFunctionalInterface() {
            @Override
            public void func() {
                System.out.println("传入匿名内部类实现...");
            }
        });

        //方法的参数是一个接口，可以使用lambda表达式实现
        show(()-> System.out.println("lambda表达式实现..."));
    }


    //方法的参数是一个接口
    private static void show(MyFunctionalInterface myInterface) {
        myInterface.func();
    }
}
