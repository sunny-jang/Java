class E { // 슈퍼클래스
  void bye() {
    System.out.println("Good bye");
    
  }
}

class J extends E { // 서브클래스
  void bye() {
    System.out.println("안녕히 계세요");
  }
}

class EJ {
  void greet(E e) {
    e.bye();
  }
}

class Parmas {
  public static void main(String[] args) {
    E oe = new E();
    J oj = new J();
    EJ oej = new EJ();

    oej.greet(oe); //  인수 : 슈퍼클래스의 오브젝트
    oej.greet(oj); //  인수 : 서브클래스의 오브젝트
  }
}