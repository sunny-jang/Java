import java.util.Scanner;

class ScannerSample {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);

    System.out.println("역 이름을 입력하세요.");
    String stationName = sc.next();
    System.out.println(stationName);
    System.out.println("플랫폼 번호를 입력하세요");
    int num = sc.nextInt();

    sc.close();

    System.out.println(stationName + "역 " + num + "번 홈입니다.");
  }
}