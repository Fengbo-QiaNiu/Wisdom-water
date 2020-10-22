package fengbo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by @author LiuChunhang on 2020/9/21.
 */
public class SocketUDPReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        DatagramPacket datagramPacket = new DatagramPacket(new byte[1024],1024);
        datagramSocket.receive(datagramPacket);

        byte[] data = datagramPacket.getData();
        String s= new String(data);
        System.out.println(s);

    }
}
