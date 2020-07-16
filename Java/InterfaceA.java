interface IA {
  public static final int a = 2;
  public void say();
}

class B3 implements IA {
  public void say() {
    System.out.println("Hello");
  }
}

public class InterfaceA{
  public static void main(String[] args) {
   B3 ob = new B3();

   System.out.println("ob.a = "+ B3.a);
   ob.say();
  }
}