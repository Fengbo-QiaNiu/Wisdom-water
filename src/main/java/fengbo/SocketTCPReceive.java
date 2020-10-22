package fengbo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by @author LiuChunhang on 2020/9/21.
 */
public class SocketTCPReceive {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        //侦听客户端socket
        Socket accept = serverSocket.accept();
        //获取客户端ip
        String hostAddress = accept.getInetAddress().getHostAddress();
        //获取客户端输出流
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);

        System.out.println("接收到的数据长度为"+read+"。数据为："+new String(bytes));
        System.out.println("发送数据的IP地址为"+hostAddress);
        //关闭客户端socket
        accept.close();
    }
}
