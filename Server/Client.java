
import java.io.*;
import java.net.*;


public class Client {
  public static void main(String args[]) throws Exception {
      String server = args[0];
      int port = Integer.parseInt(args[1]);
      Socket cSocket = new Socket(server, port); // 클라이언트 소켓 생성
      InputStream iStream = cSocket.getInputStream(); // 소켓 입력 스트림 생성
      DataInputStream distream = new DataInputStream(iStream); // 스트림 변환

      for(int i=1; i<=5; i++) {
        int imsg = distream.readInt(); // 데이터수신
        System.out.println("서버로부터 받은 데이터 : " + imsg);
      } 

      cSocket.close();
    }
  }
