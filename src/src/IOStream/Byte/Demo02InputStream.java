package IOStream.Byte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : 赵静超
 * @date Date : 2019/10/26 12:28
 * @description : 字节输入流 从硬盘中读取数据到内存中
 */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        func1();
    }

    /**
     * 一次性读取一个字节
     */
    private static void func1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("c:/Users/Administrator/Desktop/a.txt");
        int data;
        while ((data=fileInputStream.read())!=-1){
            System.out.print((char)data);
        }
        fileInputStream.close();
    }
}
