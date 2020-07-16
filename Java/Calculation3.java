abstract class Cal2 {
  int a;
  int b;

  abstract int result();

  void printResult() {
    System.out.println(result());
  }

  void setDate(int m, int n) {
    a = m;
    b = n;
  }
}

class Plus1 extends Cal2{
  int result() { return a+b; } // 오버라이딩
}

class Minus extends Cal2 {
  int result() { return a-b; } // 오버라이딩
}

class Calculation3 { 
  public static void main(String[] args) {
    int x = 34; int y =12;

    Cal2 rp = new Plus1();
    Cal2 rm = new Minus();

    rp.setDate(x, y);
    rm.setDate(x, y);
    System.out.printf("%d + %d = ", x,y);
    rp.printResult();
    System.out.printf("%d - %d = ", x,y);
    rm.printResult();
  }
}