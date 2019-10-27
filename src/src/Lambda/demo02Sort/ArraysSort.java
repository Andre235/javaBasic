package Lambda.demo02Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author : 赵静超
 * @date Date : 2019/9/22 9:28
 * @description : Lambda表达式有参数、有返回值练习
 *                需求:
 *                    使用数组存储多个Person对象
 *                    对数组中的Person对象使用Arrays的sort方法按照年龄进行升学排序
 */
public class ArraysSort {
    public static void main(String[] args) {
        func1();
        //func2();
    }

    private static void func1() {
        //使用对象数组存储多个Person对象
        Person[] arrPerson= {
                new Person("柳岩",35),
                new Person("古力娜扎",30),
                new Person("倪妮",29)
        };

        //对数组中的Person对象使用Arrays的sort方法按照年龄进行升学排序(前面-后面)
        /*Arrays.sort(arrPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/

        Arrays.sort(arrPerson,(p1,p2)->p1.getAge()-p2.getAge());
        for (Person person : arrPerson) {
            System.out.println(person);
        }
    }

    //使用ArrayList<Person>实现
    private static void func2() {
        ArrayList<Person> list = new ArrayList<>();
        Collections.addAll(list,
                new Person("柳岩",35),
                new Person("古力娜扎",30),
                new Person("倪妮",29));

        /*Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge()-p2.getAge();
            }
        });*/

        Collections.sort(list, Comparator.comparingInt(Person::getAge));
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
