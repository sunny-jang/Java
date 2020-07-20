
class Exception_example {
  public static void main(String[] args) {

    try {
      back(args[0]);
    }catch(Exception e) {
      System.out.println("There is no args");
    }finally {
      System.out.println("End");
    }
  }

  static void back(String a) throws Exception {
    System.out.println("The arg is "+a);
  }
}