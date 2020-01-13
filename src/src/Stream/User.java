package Stream;

import java.util.Date;

/**
 * @author : 赵静超
 * @date Date : 2019/10/28 22:13
 * @description :
 */

public class User {

    private int age ;
    private String name ;
    private String sex;
    private Date birthday;

    public User(int age, String name, String sex, Date birthday) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}

