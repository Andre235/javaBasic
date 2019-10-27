package FunctionalInterface.Demo02Lambda;

/**
 * @author : 赵静超
 * @date Date : 2019/10/26 22:38
 * @description :  使用Lambda表达式优化日志案例
 *                 特性：延迟加载
 *                 使用Lambda表达式前提：必须是一个函数式接口(该接口有且只有一个抽象方法)
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        showLog(1,()-> msg1+msg2+msg3);
    }

    private static void showLog(int level,BuilderMessage builderMessage) {
        if(level==1){
            System.out.println(builderMessage.msgBuilder());
        }
    }
}
