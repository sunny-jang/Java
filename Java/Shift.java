class ShiftLeft {
  public static void main(String[] ar) {
     // << shift operation

     // 최상위 비트보다 왼쪽으로 시프트된 비트는 삭제되고, 최하위 비트는 0으로 채워짐

     //178 << 2 
     //   10110010
     //10|11001000
     //<- 2bit

     // 2의 거듭제곱 연산을 할 때 쓰임!!!
     // ex) 178 *2 *2 = 178 << 2
     // ex) 178 *2 *2 *2 =178 << 3

     int a = 178, b, N =3;
    
     b = a << N;

     System.out.printf("    10진수: %04d << %d = %04d \n" ,a,N,b);
     System.out.printf("    16진수: %04X << %X = %04X \n" ,a,N,b);
     System.out.printf("하위 1바이트: 1011 0010 << 2\n");
     System.out.printf("    = 1100 1000 \n");
  }
}