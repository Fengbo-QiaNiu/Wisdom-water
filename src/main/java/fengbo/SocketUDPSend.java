package fengbo;

import java.io.IOException;
import java.net.*;

/**
 * Created by @author LiuChunhang on 2020/9/21.
 */
public class SocketUDPSend {
    public static void main(String[] args) throws IOException {
        byte[] s = "hello".getBytes();
        int length=s.length;
        InetAddress address = InetAddress.getByName("丰博水联网-刘春航");
        DatagramSocket datagramSocket = new DatagramSocket(8080);
        DatagramPacket datagramPacket = new DatagramPacket(s,length,address,8888);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
