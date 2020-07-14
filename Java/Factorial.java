public class Factorial {
  public static Long fact1(long n) {
    long fact = 1;
    if(n == 0) {
      return fact;
    }

    for(long i = 1; i<=n; i++) {
      fact *= i;
    }

    return fact;  
  }

  public static long fact2(long n) {
    if(n == 0) { return 1;}
    return (n ==1) ? 1: n*fact2(n-1);
  }

  public static void main(String[] args) {
    long n = 5;
    long y1 = fact1(n);
    long y2 = fact2(n);
    System.out.println(n + "! = " + y1);
    System.out.println(n + "! = " + y2);
  }
}