
class B2 {
  private static int b = 2;

  static int get() {
    return b;
  }
}

public class Static2 {
  public static void main(String[] args) {
    B2 b1 = new B2();

    System.out.println("b.a = " + B2.get());


    System.out.println("b1.a = " + b1.get());
  }
}