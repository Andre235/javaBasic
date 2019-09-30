package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * @author : 赵静超
 * @date : 2019/9/30 10:43
 * @description : ArrayList<>泛型只能存储引用类型，不能存储基本数据类型
 */
public class Demo1 {
    public static void main(String[] args) {
        //func1();
        func2();
    }

    private static void func1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("赵丽颖0");
        System.out.println(list);
        list.add("赵丽颖1");
        list.add("赵丽颖2");
        System.out.println(list);

        //get()
        System.out.println("----------get()----------");
        System.out.println(list.get(1));
        //remove()
        System.out.println("----------remove()----------");
        String remove = list.remove(1);
        System.out.println(remove);
        System.out.println("删除之后的ArrayList为"+list);
        System.out.println("----------size()----------");
        System.out.println("获取ArrayList数组大小:"+list.size());


    }

    //生成6个1-33之间的随机整数，并添加到集合中，最后遍历出来
    private static void func2() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int result=random.nextInt(33)+1;
            list.add(result);
        }
        System.out.println(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
