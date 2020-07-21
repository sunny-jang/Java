
import java.io.*;
import java.net.*;


public class UDPServer {
  public static void main(String args[]) throws Exception {
      DatagramSocket ds = new DatagramSocket(); // 소캣생성
      InetAddress ia = InetAddress.getByName(args[0]); // 주소생성
      int port = Integer.parseInt(args[1]); // 포트번호

      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("전송할 메세지를 입력하세요. (끝내려면 bye 입력)");

      String buf;

      do {
        buf = in.readLine(); // 키보드로부터 한 줄 입력
        byte buffer[] = buf.getBytes(); //바이트 배열로 별환
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length, ia, port); // 패킷화
        ds.send(dp); //전송
      } while (!buf.equals("bye"));

      ds.close();
    }
  }
