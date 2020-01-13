package Stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author : 赵静超
 * @date Date : 2019/10/28 22:12
 * @description :
 */
public class Test {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User(40,"马云","男",new Date(2019,1,11,11,11,50)));
        userList.add(new User(30,"李彦宏","男",new Date(2019,1,11,11,11,40)));
        userList.add(new User(29,"董明珠","女",new Date(2019,1,11,11,11,2)));
        userList.add(new User(35,"董卿","女",new Date(2019,1,11,11,11,45)));

/*        ArrayList<Student> list = new ArrayList<>();


        userList.forEach(user -> {
            String name = user.getName();
            list.add(new Student(name,name));
        });
        list.forEach(System.out::println);

        List<User> collect = userList.stream()
                .filter(user -> user.getName().length() == 2)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);*/

        funcSort(userList);

        //long date =new Date(2019, Calendar.JANUARY,11,11,11,11).getTime();
    }

    /**
     * stream流默认排序
     */
    private static void funcSort(List<User> list){
        //list.stream().sorted(Comparator.comparingInt(User::getAge)).forEach(System.out::println);
        list.stream().sorted((s1,s2)-> (int) (s1.getBirthday().getTime()-s2.getBirthday().getTime())).forEach(System.out::println);
    }


}
