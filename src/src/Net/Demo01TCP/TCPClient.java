package Net.Demo01TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author : 赵静超
 * @date Date : 2019/10/26 15:49
 * @description : TCP通信的客户端：向服务器端发送连接请求、向服务器发送数据、读取服务器回写的数据
 *                父类：java.net.socket
 *                     构造方法
 *                          Socket(String host,int port) (主机名，端口号)
 *                     成员方法
 *                          getOutputStream()
 *                          getInputStream()
 *                步骤：
 *                    1、创建Socket对象，构造方法传入服务器端的IP地址、端口号
 *                    2、使用Socket对象中的getOutputStream()方法获取网络字节的OutputStream流对象
 *                    3、使用网络字节OutputStream输出流对象中的write方法，给服务器发送数据
 *                    4、使用Socket对象中的getInputStream()方法获取网络字节的InputStream流对象
 *                    5、使用网络字节InputStream输入流对象中的read方法，读取服务器回写的数据
 *                    6、关闭Socket资源
 *                注意事项：
 *                    1、客户端与服务器端进行数据交互时，必须使用Socket提供的网络流对象，不能使用自己创建的流对象
 *                    2、当创建Socket客户端对象时，就会去请求服务器，和服务器建立三次握手
 *                         如果服务器没有启动，则会抛出异常
 *                         如果服务器启动，则会进行交互
 *
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        //创建网络字节输出流对象，向服务器发送数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好，服务器".getBytes());
        //创建网络字节输入流对象，接收服务器发送的数据
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        //释放资源
        socket.close();

    }
}