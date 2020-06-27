import java.util.Scanner;
class Keyboard_input {
  public static void main(String[] ar) {

    Scanner ob_sc = new Scanner(System.in);
    String name;
    int age;

    System.out.println("Enter your name and age.");

    name = ob_sc.next();
    age = ob_sc.nextInt();

    System.out.println(name + " is a cool name.");
    System.out.println(age + " years old is good age to learn Java.");

  }
}