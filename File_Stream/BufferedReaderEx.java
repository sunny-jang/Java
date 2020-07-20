
import java.io.*;

class BufferedReaderEx {
  public static void main(String[] args ) {
    try {

      InputStreamReader key = new InputStreamReader(System.in);
      // System.in 이 들어가거나 FileInputStream 객채가 들어가야함..?
      BufferedReader in = new BufferedReader(key);

      int a, b=7;
      // System.out.println("이름을 입력하세요.");
      // String name = in.readLine();

      System.out.println("숫자 맞추기 퀴즈! 0~9 사이의 숫자를 입력하세요.");
      String c = in.readLine(); // 키보드로부터 문자열 입력
      a = Integer.parseInt(c); // 문자를 정수로 변환

      while (a != b) {
        if((a == b-1) || (a== b+1)) {
          System.out.println("아깝습니다.");
        }
        else if(a > b+1)
          System.out.println("좀 더 작은 수입니다..");
        else if(a <= b-1)
          System.out.println("좀 더 큰 수입니다..");

          c = in.readLine();
          a = Integer.parseInt(c);

      } 

    }catch(Exception e) {

    }
  }
}