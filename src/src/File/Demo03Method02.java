package File;

import java.io.File;
import java.io.IOException;

/**
 * @author : 赵静超
 * @date Date : 2019/9/22 14:46
 * @description :  创建删除功能方法
 */
public class Demo03Method02 {
    public static void main(String[] args) throws IOException {
        //funcCreateNewFile();
        //funcMkdirs();
        funcDelete();
    }

    /**
     * public boolean createNewFile()
     * 当且仅当该文件不存在时创建一个空的文件
     * 返回值：
     *      true：文件不存在，创建文件，返回true
     *      false：文件存在，不会创建，返回true
     *  注意：
     *      此方法只能创建文件，不能创建文件夹
     *      如果给定路径不存在，则抛出异常
     *
     */
    private static void funcCreateNewFile() throws IOException {
        //传入绝对路径创建文件
        File file = new File("F:\\GitCode\\java0\\test.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);

        //传入相对路径创建文件
        File f1 = new File("t.txt");
        System.out.println(f1.createNewFile());

        File file1 = new File("F:\\GitCode\\jav\\test.txt");  //路径不存在，抛出异常
        System.out.println(file1.createNewFile());
    }

    /**
     * public boolean mkdir();  创建单级文件夹
     * public boolean mkdirs();  创建多级文件夹
     * 返回值：
     *      true 传入的文件夹不存在，创建成功
     *      false 传入的文件夹存在，创建失败
     */
    private static void funcMkdirs() {
        File file = new File("F:\\1");
        System.out.println("创建单级文件夹："+file.mkdir());

        File file1 = new File("F:\\2\\3\\4");
        System.out.println("创建多级文件夹："+file1.mkdirs());
    }

    /**
     * delete(); 删除File传入的文件夹或者文件 (只能一级一级删除)
     * 返回值：
     *      true：文件或文件夹删除成功
     *      false：文件夹中有内容，不会删除(路径未指定全)
     *             指定的路径不存在
     * 注意事项：
     *      delete()直接删除硬盘上的文件、文件夹，不走回收站
     */
    private static void funcDelete() {
        File file = new File("F:\\a.txt");   //当前文件不存在
        System.out.println("file删除状态："+file.delete());

        File file1 = new File("F:\\aaa");  //删除的文件夹里面有文件
        System.out.println(file1.delete());


    }

}
