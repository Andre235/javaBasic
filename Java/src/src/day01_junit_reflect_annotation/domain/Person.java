package day01_junit_reflect_annotation.domain;

/**
 * @author : 赵静超
 * @date Date : 2019/9/14 20:30
 * @description : 反射实例person类
 */
public class Person {
    private String name;
    private int age;
    public String a;
    protected String b;
    String c;
    private String d;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public void eat(){
        System.out.println("eating...");
    }

    public void eat(String food){
        System.out.println("eating..."+food);
    }
}

