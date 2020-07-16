
class B {
  private static int b = 2;

  int get() {
    return b;
  }
}

public class Static {
  public static void main(String[] args) {
    B b1 = new B();

    // 스태틱은 공유하는 변수라 전부 바꾸게 된다.

    System.out.println("b2.a = " + b1.get());
  }
}