
class A {
  static int a = 2;
}

public class CommonA {
  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new A();

    a1.a = 50;
    // 스태틱은 상위부터 바꾸게 된다.

    System.out.println("a1.a = " + a1.a);
    System.out.println("a2.a = " + a2.a);
  }
}