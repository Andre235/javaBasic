##反射
~~~*反射：框架设计的灵魂
反射：将类的各个组成部分封装为其他对象，这就是反射机制。
封装过程：成员变量->Fields[] fields  构造方法->Constructor[] cons  成员方法->Methods[] methods
好处：1、在程序运行过程中，操作这些对象
      2、可以解耦，提高程序的可扩展性
案例：
    需求：不改变框架中任何代码，实现创建任意类对象，执行任意方法
    实现：反射技术、配置文件
    步骤：
         1、将需要创建对象的全类名和需要执行的方法放在配置文件中
         2、在程序中加载读取配置文件
         3、使用反射技术加载类文件进入内存
         4、创建对象

获取class对象的三种方式(字节码文件)
    1.Source源码阶段
        Class.forName("全类名")
            将字节码文件加载进内存，返回class对象
            *多用于配置文件，将类名定义在配置文件中，读取文件，获取属性
    2.class类对象阶段
        类名.class
            通过类名的属性class获取
            *多用于参数的船体
    3.Runtime运行时阶段
        对象.getClass()
            getClass()方法在Object类中定义着
            *多用于对象的字节码文件的获取
~~~
##注解
~~~
注解：说明程序的，给JVM看的
注解：用文字描述程序，该程序员看的
定义：注解（Annotation），也叫元数据。一种代码级别的说明。它是JDK1.5及以后版本引入的一个特性，与类、接口、枚举是在同一个层次。
     它可以声明在包、类、字段、方法、局部变量、方法参数等的前面，用来对这些元素进行说明，注释。
作用分类：
    ①编写文档：通过代码里标识的注解生成文档【生成文档doc文档】
    ②代码分析：通过代码里标识的注解对代码进行分析【使用反射】
    ③编译检查：通过代码里标识的注解让编译器能够实现基本的编译检查【Override】
    
1、熟悉JDK中预定义的一些注解
    @Override：检测该注解标注的方法是否继承父类方法
    @Deprecated：标注的内容已经过时
    @SuppressWarnings：压制警告
    
2、自定义注解
    2.1注解组成部分：
        注解
        public @interface 注解名称{}
    2.2注解本质：
        本质是一个接口，继承自Annotation接口
        public interface MyAnnotation extends java.lang.annotation.Annotation {
        }
    2.3属性：接口中的抽象方法
        方法的返回值类型：
            基本数据类型
            String
            枚举
            注解
            以上类型的数组类型
        2.3.1注意事项
            在使用注解是必须给注解赋值
            注解属性允许有默认属性，String name() default "张三";
            如果注解只有一个属性，并且名称为value，则可以不写属性名称直接进行赋值
            进行数组赋值时，值用{}进行包裹
    2.4元注解：用于描述注解的注解
        @Target：描述注解作用的位置
            @Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD}) //表示该注解可以作用在类上、方法上、成员变量上
        @Retention：描述注解被保留的阶段(源码阶段、.class阶段、运行时阶段)
            @Retention(RetentionPolicy.RUNTIME)  // 当前被描述的注解会保留到class字节码文件中，并会被JVM虚拟机读取到
        @Documented：描述注解是否被抽取到api文档中
        @Inherited：描述注解是否被继承
          
3、在程序中使用(解析)注解：获取注解中定义的值
    步骤
        3.1获取注解定义位置的对象(类对象、方法对象、属性对象)
        3.2获取指定的注解
        3.3获取注解里面定义的值
~~~
##Lambda表达式
~~~
1.Lambda表达式的标准格式
    参数、箭头、代码 
    (参数列表)->{代码}