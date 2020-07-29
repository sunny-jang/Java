class E1 { // 슈퍼클래스
  void bye() {
    System.out.println("Good bye");
    
  }
}

class J extends E1 { // 서브클래스
  void bye() {
    System.out.println("안녕히 계세요");
  }
}

class EJ {
  void greet(E1 e) {
    e.bye();
  }
}

class Parmas {
  public static void main(String[] args) {
    E1 oe = new E1();
    J oj = new J();
    EJ oej = new EJ();

    oej.greet(oe); //  인수 : 슈퍼클래스의 오브젝트
    oej.greet(oj); //  인수 : 서브클래스의 오브젝트
  }
}