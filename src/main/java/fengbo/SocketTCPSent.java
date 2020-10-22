package fengbo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by @author LiuChunhang on 2020/9/21.
 */
public class SocketTCPSent {
    public static void main(String[] args) throws IOException {
        //指定服务端的ip和端口，Socket类代表TCP协议，完成网络编程的三要素，IP，端口，协议。
        Socket socket = new Socket(InetAddress.getByName("192.168.1.36"),8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hallo".getBytes());
        socket.close();
    }
}
