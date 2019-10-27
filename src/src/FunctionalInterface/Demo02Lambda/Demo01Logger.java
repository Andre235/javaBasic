package FunctionalInterface.Demo02Lambda;

/**
 * @author : 赵静超
 * @date Date : 2019/10/26 22:29
 * @description : 日志案例
 *                存在性能浪费问题：
 *                    showLog()方法存在性能浪费问题
 *                    先拼接字符串，再调用该方法，如果日志等级！= 1，则白进行拼接字符串这个操作了
 */
public class Demo01Logger {
    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        showLog(1,msg1+msg2+msg3);
    }

    /**
     * 根据不同的日志级别，打印不同的日志信息
     * @param level
     * @param message
     */
    private static void showLog(int level,String message) {
        if(level==1)
            System.out.println(message);
    }
}
