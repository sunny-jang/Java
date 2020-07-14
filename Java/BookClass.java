class Book {
  String title;
  int price;
  int num;

  int sum() {
    return (price * num);
  }
}


class BookClass {
  public static void main(String[] arg) {
    Book book1 = new Book();

    System.out.println("Book 클래스의 오브젝트 book1 생성 성공");

    System.out.println("book1.title = " + book1.title);
    System.out.println("book1.price = " + book1.price);
    System.out.println("book1.num = " + book1.num);
  }
}