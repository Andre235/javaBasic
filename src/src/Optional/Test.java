package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


/**
 * @author : zhaojingchao
 * @date : 2019/12/2
 * @description :
 */
public class Test {
    public static void main(String[] args) {
//        List<Student> studentList = initData();
//        for (Student student : studentList) {
//            Optional<Student> studentOptional = Optional.of(student);
//            Integer score = studentOptional.filter(s -> s.getAge() >= 18).map(Student::getScore).orElse(0);
//            if (score > 80) {
//                System.out.println("入选：" + student.getName());
//            }
//        }

        test();

    }

    private static void test() {
        List<Student> studentList = initData();
        Integer integer = Optional.ofNullable(studentList.get(2).getScore()).orElse(0);
        System.out.println(integer);
    }

    public static List<Student> initData(){
        Student s1 = new Student("张三", 19, 80);
        Student s2 = new Student("李四", 19, 50);
        Student s3 = new Student("王五", 23, null);
        Student s4 = new Student("赵六", 16, 90);
        Student s5 = new Student("钱七", 18, 99);
        Student s6 = new Student("孙八", 20, 40);
        Student s7 = new Student("吴九", 21, 88);

        return Arrays.asList(s1, s2, s3, s4, s5, s6, s7);
    }


}

class Student {
    private String name;
    private int age;
    private Integer score;

    public Student(String name, int age, Integer score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    //省略 construct get set

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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}