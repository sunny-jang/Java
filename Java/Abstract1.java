abstract class Cal1 {
  // abstract 은 추상클래스로써 프로토타입을 제시
  // 빈 메소드와, 빈 변수들을 제공하고 이렇게 쓰라는 형태만 제시하는 것. 
  // abstract 클래스틑 따로 인스턴스를 만들 수 없음
  int a;
  int b;

  abstract void answer();

  void setDatat(int m, int n) {
    a = m;
    b = n;
  }
}


class Plus extends Cal1 {
  void answer() {
    System.out.println(a + "+" + b +" = " + (a+b));
  }
}


public class Abstract1{
  public static void main(String[] args) {
    Plus ob = new Plus();
    ob.setDatat(1, 2);
    ob.answer();
  }
}