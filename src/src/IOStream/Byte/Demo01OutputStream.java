package IOStream.Byte;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : 赵静超
 * @date Date : 2019/10/26 12:28
 * @description : java.io.OutputStream表示所有输出字节流的超类
 *                使用步骤：
 *                    1、创建FileOutputStream对象，构造方法传入写入指定文件中
 *                    2、调用对象的write()方法，把数据写入到文件中
 *                    3、释放资源(提高程序运行效率)
 */
public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        //func1();
        func2();
    }

    private static void func1() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("c:/Users/Administrator/Desktop/a.txt");
        byte[] bytes = "你好".getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    /**
     * 追加写，不再创建新的的文件对象覆盖原来文件
     */
    private static void func2() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("c:/Users/Administrator/Desktop/a.txt",true);
        for (int i = 0; i < 7; i++) {
            fileOutputStream.write("你好".getBytes());
            fileOutputStream.write("\r\n".getBytes());
        }
        fileOutputStream.close();
    }


}
