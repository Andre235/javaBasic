package day01_junit_reflect_annotation.JunitTest;

import day01_junit_reflect_annotation.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author : 赵静超
 * @date Date : 2019/9/14 19:39
 * @description : 测试类
 */
public class CalculatorTest {

    /**
     * 一般资源申请，在所有测试方法执行之前执行
     */
    @Before
    public void init(){
        System.out.println("init...");
    }

    /**
     * 一般用于资源释放，在所有测试方法执行之后执行
     */
    @After
    public void close(){
        System.out.println("close...");
    }
    /**
     * 测试加法方法
     */
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.add(1,2);
        System.out.println("testAdd()...");
        //调用断言方法
        Assert.assertEquals(3,result);
    }

    /**
     * 测试减法方法
     */
    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        int result = calculator.sub(1,2);
        //调用断言方法
        Assert.assertEquals(-1,result);
        System.out.println("testAdd()...");
    }

}
