package Static;

/**
 * @author : 赵静超
 * @date : 2019/9/30 17:06
 * @description : Static关键字用于成员变量上，可以直接通过类名.静态成员名直接进行访问
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student.room="中国传媒大学";
        Student stu1 = new Student("古力娜扎",25);
        Student stu2 = new Student("迪丽热巴",26);

        System.out.println("学号："+stu1.getId()+" "+"姓名："+stu1.getName()+" "+"年龄："+stu1.getAge()+" "+"高校："+Student.room);
        System.out.println("学号："+stu2.getId()+" "+"姓名："+stu2.getName()+" "+"年龄："+stu2.getAge()+" "+"高校："+Student.room);

    }
}
