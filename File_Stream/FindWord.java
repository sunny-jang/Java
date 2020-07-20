
import java.io.*;

class FindWord {
  public static void main(String[] args ) {
    try {

     //택스트 파일로부터 입력을 받기위한 오브젝트 생성
     FileReader fin = new FileReader("mydictionary.txt");
     //행단위로 데이터를 읽기 위한 오브젝트 생성
     BufferedReader in = new BufferedReader(fin);

     String a = args[0];

     String eword, kword = null;

     while((eword = in.readLine()) != null) {
       if(a.equals(eword)) {
         kword = in.readLine();
         
         break;
       }
     }

     if(kword != null) {
      System.out.println(a + "이라는 단어는 없습니다.");
     } else {
        System.out.println(kword+ "입니다.");
      }
    in.close();

    }catch(Exception e) {
      System.out.println("커맨드 라인이 없습니다.");
    }
  }
}