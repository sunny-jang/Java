
class Purse {
  static int money = 0;

  void printMoney(int in, int out) {
    money = money + in -out;

    if(money < 0) {
      System.out.println((-1*money) + "원 부족합니다.");
    }else {
      System.out.println("잔금은" + money + "입니다.");
    }
  }
}

public class Shopping {
  public static void main(String[] args) {
    Purse shop1 = new Purse();

    shop1.printMoney(1000, 10);
    shop1.printMoney(0, 250);
    shop1.printMoney(0, 850);
  }
}