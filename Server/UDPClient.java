
import java.io.*;
import java.net.*;


public class UDPClient {
  public static void main(String args[]) throws Exception {
      int port = Integer.parseInt(args[0]);
      DatagramSocket ds = new DatagramSocket(port);// 소켓 생성
      String q;

      do {

        byte buffer[] = new byte[60];
        // 패킷 오프젝트 생성
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);

        ds.receive(dp); // 패킷 수신
        String msg = new String(dp.getData());
        System.out.println("수신된 메세지 : " + msg);

        q = msg.substring(0,3);
      }while(!q.equals("bye")) ;

      ds.close();// 소캣 닫음 
    }
  }
