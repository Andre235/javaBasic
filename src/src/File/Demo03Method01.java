package File;

import java.io.File;

/**
 * @author : 赵静超
 * @date Date : 2019/9/22 14:02
 * @description :
 */
public class Demo03Method01 {
    public static void main(String[] args) {
        //getAbsPath();
        //getPath();
        //getName();
        //getLength();
        func();
    }

    /**
     * 获取构造方法中传递的路径
     * 无论传递的是绝对路径还是相对路径返回的都是绝对路径
     */
    private static void getAbsPath() {
        //传入相对路径
        File f1 = new File("a.txt");
        File absoluteFile1 = f1.getAbsoluteFile();
        System.out.println(absoluteFile1);

        //传入绝对路径
        File f2 = new File("C:\\Program Files\\Java\\jdk1.8.0_131\\bin\\java.exe");
        File absoluteFile2 = f2.getAbsoluteFile();
        System.out.println(absoluteFile2);
    }

    /**
     * get.path()
     * 返回绝对路径或者相对路径
     */

    private static void getPath() {
        File f1 = new File("a.txt");
        File f2 = new File("C:\\Program Files\\Java\\jdk1.8.0_131\\bin\\java.exe");
        System.out.println(f1.getPath());
        System.out.println(f2.getPath());
    }

    /**
     * getName() 获取构造方法传递过来的结尾符号(文件或者文件加)
     */
    private static void getName() {
        File f1 = new File("C:\\Program Files\\Java\\jdk1.8.0_131\\bin");
        File f2 = new File("C:\\Program Files\\Java\\jdk1.8.0_131\\bin\\java.exe");
        System.out.println(f1.getName());
        System.out.println(f2.getName());
    }

    /**
     * 获取指定的文件的大小（字节为单位）
     * 注意：
     *      文件夹没有大小概念，不能获取文件夹大小
     *      如果传入的文件夹不存在，则返回 0
     *
     */
    private static void getLength() {
        File f1 = new File("F:\\ChromeDownload\\壁纸\\DAV.jpg");
        File f2 = new File("F:\\ChromeDownload\\壁纸\\DVA.jpg");
        System.out.println(f1.length());
        System.out.println(f2.length()/(1024*1024)+"MB");

    }

    private static void func() {
        File file = new File("F:\\ChromeDownload\\壁纸\\DVA.jpg");
        boolean directory = file.isDirectory();   // 判断file表示的是否为文件夹
        boolean file1 = file.isFile();  // 判断file表示的是否为文件
        boolean exists = file.exists();  // 判断file表示的是否真实存在
        System.out.println("此file是否为文件夹："+directory);
        System.out.println("此file是否为文件："+file1);
        System.out.println("此file是否真实存在："+exists);
    }

}
