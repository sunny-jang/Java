class Cast3 {
  public static void main(String[] ar) {
    byte a= 127; // 0x7f
    short b = 32767; // 0x7fff

    System.out.println("a = "+a+",b = " +b);
    b = (short)a;
    System.out.println("byte -> short : "+a+ "-> " +b);

    b = 32767;
    a = (byte)b;
    System.out.println("short -> byte : " +a+ "-> "+b);
  }
}