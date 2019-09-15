package day01_junit_reflect_annotation.annotation;


/**
 * @author : 赵静超
 * @date Date : 2019/9/15 11:44
 * @description :
 */
@MyAnnotation3
@MyAnnotation(age=22,name="马云",per=Person.perosn1,strs={"aaa","bbb"})
public class Worker {

    @MyAnnotation3
    private String name= "";

    @MyAnnotation3
    public void show(){

    }

}
