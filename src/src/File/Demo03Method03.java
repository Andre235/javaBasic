package File;

import java.io.File;

/**
 * @author : 赵静超
 * @date Date : 2019/9/22 17:13
 * @description : 遍历文件夹功能
 */
public class Demo03Method03 {
    public static void main(String[] args) {
        func1();
        func2();
    }


    /**
     * public String[] list()
     * 进行一级遍历，会把当前传入的文件夹进行遍历，输出文件以及文件夹
     * 异常：
     *      传入参数不是一个文件
     *      传入参数文件不存在
     */
    private static void func1() {
        File file = new File("D:\\PR");
        String[] list = file.list();
        int num=0;
        for (String name : list) {
            num++;
            System.out.println(name);
        }
        System.out.println("当前目录中所含文件以及文件夹个数为"+num);
    }

    /**
     * public File[] listFiles()
      */
    private static void func2() {
        File file = new File("D:\\PR");
        File[] files = file.listFiles();
        for (File f: files) {
            System.out.println(f);
        }

    }
}
