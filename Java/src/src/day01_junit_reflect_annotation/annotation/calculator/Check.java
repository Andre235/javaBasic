package day01_junit_reflect_annotation.annotation.calculator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : 赵静超
 * @date Date : 2019/9/15 15:09
 * @description : 自定义check测试注解
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Check {

}
