class DoWhile {
  public static void main(String[] ar) {
    int sum = 0, i = 0;

    do {
      i++;
      sum = sum + i;
    }while(i<10); // must put ;

    System.out.println("1 ~ " +i+ "의 합은 = "+ sum);

  }
}