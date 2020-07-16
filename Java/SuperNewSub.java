class X11 {
  int m = -10;
  X11() {
    System.out.println("슈퍼클래스 X의 생성자 실행");
  }
}
class Y11 extends X11 {
  int n = 10;
  Y11() {
    System.out.println("서브클래스 Y의 생성자 실행");
  }
}
class SuperNewSub {
  public static void main(String[] args) {
  System.out.println("X ox1 = new X()");
  X11 ox1 =  new X11();
  System.out.println();

  System.out.println("X ox2 = new Y()");
  X11 ox2 = new Y11();
  System.out.println("ox2.m = " + ox2.m);

  // Y11 oy = new X(); // 서브클래스 오브젝트에 슈퍼클래스 생성자를 사용(에러)

  }
}