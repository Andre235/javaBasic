package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : 赵静超
 * @date Date : 2019/9/15 14:31
 * @description : 该注解描述需要执行的类名和方法名
 */
@Target({ElementType.TYPE})  //描述该注解能过作用在类上
@Retention(RetentionPolicy.RUNTIME)  //期望该注解能过保留在运行时RUNTIME阶段
public @interface Pro {

    String className();
    String methodName();

}
