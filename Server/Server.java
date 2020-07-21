import java.io.*;
import java.net.*;

public class Server {
  public static void main(String args[]) throws Exception {
    int port = Integer.parseInt(args[0]);

    ServerSocket ssocket = new ServerSocket(port);

    System.out.println("서버 실행 중..");
    while(true) {
      Socket cSocket = ssocket.accept(); // 연결수락, 클라이언트 소켓 생성
      OutputStream oStream = cSocket.getOutputStream(); // 소켓 출력 스트림 생성
      DataOutputStream dostream = new DataOutputStream(oStream); // 스트림 변환

      for(int imsg = 1; imsg <= 5; imsg ++) {
        dostream.writeInt(imsg); // 데이터전송
      }

      cSocket.close();
    }
  }
}