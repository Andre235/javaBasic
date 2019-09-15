package day01_junit_reflect_annotation.reflect;


import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author : 赵静超
 * @date Date : 2019/9/14 21:39
 * @description : 利用反射技术，设计一个框架
 *                需求：可以创建任意类对象，执行任意方法
 */
public class FrameworkClass {

    /**
     * 需求：不改变框架中任何代码，实现创建任意类对象，执行任意方法
     * 实现：反射技术、配置文件
     * 步骤：
     *      1、将需要创建对象的全类名和需要执行的方法放在配置文件中
     *      2、在程序中加载读取配置文件
     *      3、使用反射技术加载类文件进入内存
     *      4、创建对象
     *      5、执行方法
     */
    public static void main(String[] args) throws Exception{

        /*Student student = new Student();
        student.sleep();*/

        //1.加载配置文件
        //1.1创建properties对象
        Properties properties = new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2.1获取class目录下的配置文件(获取类加载器)
        ClassLoader classLoader = FrameworkClass.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("configuration.properties");
        properties.load(inputStream);

        //2.获取配置文件中定义的数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //3.加载该类进内存
        Class Person = Class.forName(className);
        //4.创建该类对象
        Object personObj = Person.newInstance();
        //5.获取该类方法
        Method eat = Person.getMethod(methodName);
        //6.执行方法
        eat.invoke(personObj);

    }
}
