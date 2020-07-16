class Greet {
  void greet() {

  }
}

interface Bye {
  void bye(); // public abstract void bye;
}

class Greeting extends Greet implements Bye {

  void greet() {
    System.out.println("안녕하세요!");
  }

  @Override
  public void bye() {
    System.out.println("안녕히 계세요!");
  }
}

class Meet2 {
  public static void main(String[] args) {
    Greeting og = new Greeting();
    og.greet();
    og.bye();
  }
}