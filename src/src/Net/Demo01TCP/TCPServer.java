package Net.Demo01TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : 赵静超
 * @date Date : 2019/10/26 16:15
 * @description : TCP通信的服务器端：接收客户端发送的请求，读取客户端发送的的数据，向客户端回写数据
 *                父类：java.net.ServerSocket
 *                构造方法：
 *                    ServerSocket(int port)  创建指定端口好的服务器套接字对象
 *                服务器端必须知道是哪个客户端向我发送请求
 *                成员方法：
 *                    Socket accept(); 侦听并接收客户端的连接
 *                实现步骤：
 *                    同客户端步骤
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        //获取发送请求的客户端对象
        Socket socket = serverSocket.accept();
        //获取网络字节输入流对象，接收客户端发送的数据
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        //创建网络字节输出流对象，向客户端回写数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("收到，谢谢".getBytes());
        //释放资源
        socket.close();
        serverSocket.close();
    }
}
