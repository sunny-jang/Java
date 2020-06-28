class Data12 {
    public static void main(String[] ar) {
        int i,j;
        int [][] a = {
          {10,20,30},
          {40,50},
          {60}
        };

        for(i = 0; i<3; i++)
          for(j = 0; j<3-i; j++)
            System.out.println(a[i][j]);
    }

}