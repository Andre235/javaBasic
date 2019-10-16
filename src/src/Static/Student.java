package Static;

/**
 * @author : 赵静超
 * @date Date : 2019/10/2 8:02
 * @description :
 */
public class Student {

    private String name;
    private int age;
    private int id;
    static String room;
    private static int idCounter=0;

    public Student() {
        this.id=++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idCounter;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
