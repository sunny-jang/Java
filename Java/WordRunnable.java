class WordRunnable implements Runnable {
  private String word;
  private int time;
  private int count;

  public WordRunnable(String w, int t, int c) {
    word = w;
    time = t;
    count = c;
  }

  public void run() {
    for(int n = 0; n < count; n++) {
      System.out.println(word);

      try {
        Thread.sleep(time); //time만큼 밀리초 만큼 현재 쓰레드 대기
      }catch(Exception e) {
      }
    }
  }

  public static void main(String[] ar) {
    WordRunnable tick = new WordRunnable("tick", 1000, 3);
    WordRunnable tack = new WordRunnable("tack", 1000, 2);

    Thread tickTread = new Thread(tick);
    Thread tackTread = new Thread(tack);


    tickTread.start();

   try {
    Thread.sleep(500); // 500밀리초만큼 쓰래드 대기
   }catch(Exception e) {

   }
   tackTread.start();
  }
}