package day01_junit_reflect_annotation.annotation;

import java.lang.annotation.*;

/**
 * @author : 赵静超
 * @date Date : 2019/9/15 14:07
 * @description :设置注解的元注解
 * @Target：描述注解被保留的阶段
 * @Retention：描述注解被保留的阶段(源码阶段、.class阶段、运行时阶段)
 * @Documented：描述注解是否被抽取到api文档中
 * @Inherited：描述注解是否被继承
 */

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD}) //表示该注解可以作用在类上、方法上、成员变量上
@Retention(RetentionPolicy.RUNTIME)  // 当前被描述的注解会保留到class字节码文件中，并会被JVM虚拟机读取到
@Documented     //当前描述的注解会被抽取到javadoc文档中
@Inherited      //表示当前描述的注解会被继承
public @interface MyAnnotation3 {

}
