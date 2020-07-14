class X {
  private int a = 1;
  int b = 2;

  int getA() {
    return a;
  }
}

class Y {
  void print() {
    X x1 = new X();

    // System.out.println("x1.a = " + x1.a);
    System.out.println("x1.a = " + x1.getA());
    System.out.println("x1.b = " + x1.b);
  }
}


class PrivateAccess1 {
    public static void main(String[] ar) {
      Y oy = new Y();

      oy.print();
    }
}