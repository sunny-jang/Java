class CalEx {
    public static void main(String[] ar) {
      int [] ID = {1001, 1002, 1003, 1004};
      int [] LA = {92, 95, 97, 96};
      int [] Math = {75, 95, 90, 85};
      int [] Eng = {84, 90, 89, 97};

      int [] Sum = {0,0,0,0};
      int [] Ave = {0,0,0,0};
      int i =0;


      for(i = 0; i<4; i++)
        Sum[i] = LA[i] + Math[i] + Eng[i];

      for(i = 0; i<4; i++)
        Ave[i] = Sum[i]/3;

      System.out.println("Student Id, Korea, Math, English, Totall score, Averege");

      for(i = 0; i<4; i++){
        System.out.print(ID[i]+ " " + LA[i] + " " + Math[i]);
        System.out.println(" " + Eng[i]+ " " + Sum[i] + " " + Ave[i]);
      }
        
    }
}