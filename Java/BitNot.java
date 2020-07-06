class BitNot {
  public static void main(String[] ar) {
   byte a = -86, r;

  //  r = ~a; // We can't put ~a(which is int) to r which is byte type. It causes compile error

  // 1을 0으로 0을 1로 바꿈
  // -10을 10으로 바꿈
   
   System.out.printf("a = %4d = %X =  1010 1010\n",a,a);
   System.out.printf("~a = %4d = %X =  1010 1010\n",~a,~a); //  Not bit

   short t = (short)~a; //Not bit
   r = (byte)t; 
   System.out.printf("r = %4d = %X = 0101 0101\n", r,r);
  }

  //%d int
  //%f double/float
  //%c charactor
  //%s string
}