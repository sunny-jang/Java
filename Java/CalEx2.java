class CalEx2 {
    public static void main(String[] ar) {
      int [][]  Data = {
        {1001,1002,1003,1004},
        {92,90,93,89},
        {80,90,97,99},
        {75,92,93,85},
        {0,0,0,0},
        {0,0,0,0}
      };
      int i,j;

      for(i = 0; i<4; i++) {
        for(j = 1; j<4; j++) {
          Data[4][i] += Data[j][i];
          Data[5][i] = Data[4][i] / 3;
        }
      }

      System.out.println("Student Id, Korea, Math, English, Totall score, Averege");
      for(i = 0; i<4; i++){
       for(j = 0; j<6; j++) {
         System.out.print(Data[j][i] + " ");
       }
       System.out.println();
      }
        
    }
}