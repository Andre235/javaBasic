package FunctionalInterface.Demo02Lambda;

/**
 * @author : 赵静超
 * @date Date : 2019/10/27 8:57
 * @description : 函数式接口作为方法的参数案例
 *                使用Lambda表达式前提参数必须是一个函数式接口(有且只有一个抽象方法)
 */
public class Demo03Runnable {
    public static void main(String[] args) {

        //匿名内部类方式实现
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程已经启动...");
            }
        });

        //Lambda表达式方式实现
        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程已经启动..."));
    }

    /**
     * 函数式接口作为方法的参数案例
     * @param runnable
     */
    private static void startThread(Runnable runnable) {
        new Thread(runnable).start();
    }
}
