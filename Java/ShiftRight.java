class ShiftRight {
  public static void main(String[] ar) {
     // >>>, >> shift operation

     // 최상위 비트보다 왼쪽으로 시프트된 비트는 삭제되고, 최하위 비트는 0으로 채워짐

     //178 >> 2 // 꺽새가 두개이면 최상위 비트로 빈공간을 채움
     //178 >>2
     //10110010
     //00101100|10
     
     //178 >>> 2 // 꺽새가 세개이면 그냥 0으로 채움
     //178 >>>2
     //10110010
     //11101100|10
     
     //-> 2bit

     // 2의 거듭제곱 나누기 을 할 때 쓰임!!!
     // ex) 178 /2 /2 = 178 >>> 2
     // ex) 178 /2 /2 /2 =178 >>> 3

     byte a = -100, b, N =2;
     int t = a >> N;
    
     b = (byte)t;

     System.out.printf("    10진수: %04d >>> %d = %04d \n" ,a,N,b);
     System.out.printf("    16진수: %04X >>> %X = %04X \n" ,a,N,b);
     System.out.printf("하위 1바이트: 1011 0010 >>> 2\n");
     System.out.printf("    = 1100 1000 \n");
  }
}