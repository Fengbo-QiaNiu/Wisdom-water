package fengbo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by @author LiuChunhang on 2020/9/18.
 */
public class IP {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress name = InetAddress.getByName("丰博水联网-刘春航");
        System.out.println(name.getHostName()+"的IP地址："+name.getHostAddress());
        InetAddress Name1 = InetAddress.getByName("192.168.1.89");
        System.out.println(Name1.getHostName()+"的IP地址："+Name1.getHostAddress());
    }
}
