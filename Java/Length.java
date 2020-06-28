class Length {
    public static void main(String[] ar) {
      int i ;
      int [][] a = {
        {10,20,30},
        {40,50},
        {60}
      };

      System.out.println("a[]'s length " + a.length);
      for(i=0;i<3; i++)
        System.out.println("a["+ i +"]'s length " + a[i].length);
    }
}