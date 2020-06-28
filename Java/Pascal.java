class Pascal {
  public static void main(String[] ar) {
     int [][] Pascal ={{1},{1,2,1},{1,0,0,1},{1,0,0,0,1},{1,0,0,0,0,1}} ;

     int i=0, j=0 ;
     for(i=2;i<5;i++)
         for(j=1;j<=i;j++)
           Pascal[i][j] = Pascal[i-1][j-1] + Pascal[i-1][j] ;

     for(i=0;i<5;i++) {
         for(j=0;j<Pascal[i].length;j++)
             System.out.print(Pascal[i][j]+" ") ; 
         System.out.println() ;
     }
  }
}