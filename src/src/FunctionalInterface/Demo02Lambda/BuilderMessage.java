package FunctionalInterface.Demo02Lambda;

/**
 * @author : 赵静超
 * @date Date : 2019/10/26 22:46
 * @description : 定义一个拼接字符串的函数式接口
 */
@FunctionalInterface
public interface BuilderMessage {
    public abstract String msgBuilder();
}
