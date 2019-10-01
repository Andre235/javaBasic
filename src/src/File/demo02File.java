package File;

import java.io.File;

/**
 * @author : 赵静超
 * @date Date : 2019/9/22 11:32
 * @description :  路径：
 *                      1.绝对路径：是一个完整的路径
 *                          以盘符开始  F:\GitCode\java0
 *                      2.相对路径：是一个简化的路径
 *                          相对与当前项目的根目录
 *                          F:\GitCode\java0\.idea\misc.xml -->简化为 misc.xml
 *                      3.注意：
 *                          3.1路径不区分大小写
 *                          3.2路径中文件名称分隔符为反斜杠，反斜杠 / 为转义字符，两个反斜杠为为一个普通的反斜杠
 */
public class demo02File {
    public static void main(String[] args) {
        //func1();
        func2("C://","test.txt");
        func3();
    }




    /**
     *  构造方法1
     *  File(String pathname)
     *  String pathname 字符串的路径名称
     *  路径可以是文件夹，也可以使文件结尾
     *  路径可以是相对路径，也可以是绝对路径
     *  路径可以是真实存在的，也可以是不存在的
     */
    private static void func1() {
        File file = new File("F:\\GitCode\\java0\\a.txt");  //不存在路径
        System.out.println(file);

        File file1 = new File("F:\\GitCode\\java0");     //真实路径
        System.out.println(file1);

        File file2 = new File("b.txt");     //不存在的相对路径
        System.out.println(file2);

    }

    /**
     * 构造方法2
     * File(String parent,String child) (父路径，子路径)
     * 优点：
     *      父路径和子路径可以单独书写，非常灵活
     *      父路径和子路径可以单独变化
     */
    private static void func2(String parent,String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    /**
     * 构造方法3
     * File(File parent,String child) (父路径，子路径)
     * 优点：
     *      父路径和子路径可以单独书写，非常灵活
     *      父路径是个File类型，可以使用File方法对路径进行一系列操作，再创建File对象
     */
    private static void func3() {
        File parent = new File("C://");
        File file = new File(parent, "demo.txt");
        System.out.println(file);

    }
}
