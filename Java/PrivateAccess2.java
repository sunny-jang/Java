class X1 {
  private int a = 1;
  int aa = 2;

  int getA() {
    return a;
  }
}

class Z extends X1 {
  void print() {
    int b = 3;
  }
}


class PrivateAccess2 {
    public static void main(String[] ar) {
     Z oz = new Z();

      System.out.println("oz.aa = " + oz.aa);
    }
}