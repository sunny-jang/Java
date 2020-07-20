class Buffer {
  private int contents;
  private boolean available = false; // 데이터 유무 플래그

  public synchronized void put(int value) { //임계영역
    while(available == true) {
      System.out.println("창고가 찼음. 생산자 : 대기");

      try {
        wait(); // 다른 쓰레드에서 notify를 실행해 줄 때까지 대기
      }catch(Exception e) {}
    }
    contents = value;
    System.out.println("생산자 : 생산 " + contents);
    notify(); // 대기 상태의 쓰레드에게 신호를 보냄
    available = true; // 창고에 데이터 있음을 알림
  }

  public synchronized int get() {
    while(available == false) {
      System.out.println("창고가 비었음. 소비자 : 대기");

      try {
        wait(); // 다른 쓰레드에서 notify를 실행해 줄 때까지 대기
      }catch(Exception e) {}
    }
    System.out.println("소비자 : 소비 " + contents);
    notify(); // 대기 상태의 쓰레드에게 신호를 보냄
    available = false;
    return contents;

  }
}

class NotDeamon extends Thread {
  public void run() {
    System.out.println("독립 Thread B 시작");
    try {
      Thread.sleep(10000);
    }catch(Exception e) {

    }
    System.out.println("독립 Thread B 끝");
  }
}

class Producer extends Thread {
  private Buffer b;
  public Producer(Buffer blank) {
    b = blank; // 임계영역과 연결됨
  }
  public void run() {
    for(int i = 1; i<=5; i++) {
      b.put(i);
    }
  }
}

class Consumer extends Thread {
  private Buffer b;
  public Consumer(Buffer blank) {
    b = blank;
  }

  public void run() {
    for(int i = 1; i<=5; i++) {
      b.get();
    }
  }
}

public class WaitSync {
  public static void main(String[] args) {
    Buffer buff = new Buffer();
    Producer pro = new Producer(buff);
    Consumer con = new Consumer(buff);

    pro.start();
    con.start();
  }
}