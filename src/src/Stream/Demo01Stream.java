package Stream;

import java.util.ArrayList;

/**
 * @author : 赵静超
 * @date Date : 2019/10/27 9:53
 * @description : 传统对集合进行过滤、遍历与使用Stream流对集合进行过滤对比
 */
public class Demo01Stream {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张3");
        list.add("赵敏");
        list.add("张无忌");
        list.add("周芷若");
        list.add("张秋");

        System.out.println("使用传统方式方式实现对集合的过滤");
        func1(list);
        System.out.println("使用Stream流方式实现对集合的过滤");
        func2(list);

    }

    /**
     * 使用传统方式对集合进行过滤、遍历
     */
    private static void func1(ArrayList<String> list) {

        ArrayList<String> zhangList = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                zhangList.add(s);
            }
        }

        ArrayList<String> longList = new ArrayList<>();
        for (String s : zhangList) {
            if(s.length()==3){
                longList.add(s);
            }
        }

        for (String s : longList) {
            System.out.println(s);
        }
    }

    /**
     * 使用Stream流思想对集合进行过滤、遍历
     */
    private static void func2(ArrayList<String> list) {
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(System.out::println);
    }
}
