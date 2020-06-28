import java.util.Scanner;
class Bissextile {
  public static void main(String[] ar) {

    Scanner sc = new Scanner(System.in);
    int yr;
    boolean A, B, C, Y1, Y2;

    System.out.println("Enter the year");
    yr = sc.nextInt();

    A = (yr % 4) == 0;
    B = (yr % 100) == 0;
    C = (yr % 400) == 0;

    Y1 = (A && !B && !C) || (A && !B && C) || (A && B && C);
    Y2 = (A && !B) || (A && C);

    System.out.println("Is "+yr+ " Bissextile? " + Y1);
    System.out.println("Is "+yr+ " Bissextile? " + Y2);
  }
}