package File;

import java.io.File;

/**
 * @author : 赵静超
 * @date Date : 2019/9/22 11:13
 * @description : java.io.file类是文件和目录路径的抽象表示形式
 *                Java把电脑中的文件和文件夹封装成了一个File类，可以对其进行一系列操作
 *                创建一个文件、文件夹
 *                删除一个文件、文件夹
 *                获取一个文件、文件夹
 *                判断文件、文件夹是否存在
 *                对文件夹进行遍历
 *                获取文件夹的大小
 *              File类是一个与操作系统无关的类，任何操作系统都可以调用该类的方法
 */
public class demo01File {
    public static void main(String[] args) {
        String separator = File.separator;  //文件名称分隔符  /
        System.out.println(separator);

        String s = File.pathSeparator;   //路径分隔符 ;
        System.out.println(s);
    }
}
