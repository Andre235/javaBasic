package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : 赵静超
 * @date Date : 2019/10/28 22:12
 * @description :
 */
public class Test {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User(40,"马云","男"));
        userList.add(new User(30,"李彦宏","男"));
        userList.add(new User(29,"董明珠","女"));
        userList.add(new User(35,"董卿","女"));
        userList.add(new User(34,"倪妮","女"));

        ArrayList<Student> list = new ArrayList<>();


        userList.forEach(user -> {
            String name = user.getName();
            list.add(new Student(name,name));
        });
        list.forEach(System.out::println);

        List<User> collect = userList.stream()
                .filter(user -> user.getName().length() == 2)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

}
