class ADaemon extends Thread {
  public void run() {
    System.out.println("Daemon Thread A 시작");
    try {
      Thread.sleep(700);
    }catch(Exception e) {

    }
    System.out.println("Daemon Thread 끝");
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

public class DaemonInde {
  public static void main(String[] args) {
    System.out.println("main Thread 시작");
    ADaemon threadA = new ADaemon();
    NotDeamon threadB = new NotDeamon();

    threadA.setDaemon(true); // 대몬 쓰레드로 지정함

    threadB.setDaemon(false); // 독립 쓰레드로 지정함

    threadA.start();
    threadB.start();

    try {
      Thread.sleep(500);
    }catch(Exception e) {

    }

    System.out.println("main Thread 끝");

    // 데몬쓰레드는 mian 쓰레드 종료 후 바로 종료
  }
}