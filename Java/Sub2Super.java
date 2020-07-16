class A11 {
  int m = -10;
  void p() {
    System.out.println("슈퍼클래스 p()");
  }
}

class B11 extends A11 {
  int n = 20;
  void p() { 
    System.out.println("서브클래스 p()");
  }

  void q() {
    System.out.println("서브클래스 q()");
  }
}

class Sub2Super {
  public static void main(String[] args) {
    A11 oa = new A11();
    B11 ob = new B11();

    System.out.println("oa.m = " + oa.m);
    oa.p(); // Super class's p();

    ob.m = 10;
    oa = ob; 

    System.out.println("oa.m = " + oa.m);
    System.out.println("ob.m = " + ob.m);
    // System.out.println("oa.n = " + oa.n);

    System.out.println("ob.n = " + ob.n);
    oa.p(); //  서브클래스의 p()가 호출됨
    //있던 변수라면 덮어씌워짐
    //하지만 오버라이딩이 되지 않는 서브 클래스의 변수나 메소드를 쓰지는 못함
  }
}