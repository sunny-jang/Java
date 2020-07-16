interface IA2 {
  public abstract void sayA();
}

interface IB2 {
  public abstract void sayB();
}

interface IC2 {
  public abstract void sayC();
}

class IX implements IA2, IB2, IC2 {
  @Override
  public void sayA() {
    System.out.println("A: Hello");
  }

  @Override
  public void sayB() {
    System.out.println("B: Hello");
  }

  @Override
  public void sayC() {
    System.out.println("C: Hello");
  }
}

public class InterfaceABC{
  public static void main(String[] args) {
   IX ox = new IX();

   ox.sayA();
   ox.sayB();
   ox.sayC();
  }
}