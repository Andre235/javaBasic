package FunctionalInterface.Demo01FunctionalInterface;

/**
 * @author : 赵静超
 * @date Date : 2019/10/26 21:59
 * @description :  函数式接口(有且只有一个抽象方法，但是可以允许有其他方法)
 *                 @FunctionalInterface 检测是否为函数式接口的注解
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    public abstract void func();
}
