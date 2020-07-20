
class MyException1 extends Exception {

}

class MyException2 extends Exception {

}

class MyException {
  public static void main(String[] args ) {
    try {
      MyMethod(args[0]);
    }catch (MyException1 e1){
      System.out.println("Exceptipn1");
    }catch (MyException2 e1){
      System.out.println("Exception2");
    } finally {
      System.out.println("End");
    }
  }

  static void MyMethod(String str) throws MyException1, MyException2 {
    System.out.println("Arg is" + str);
    int x = Integer.parseInt(str);
    // String to int

    switch(x) {
      case 1:
        throw new MyException1();
      case 2:
        throw new MyException2();
      default:
      System.out.println("No exception");
    }
  }
}