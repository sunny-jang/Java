class Person {
  String name;
  int age;

  Person(String name, int age) { // 권장하지 않는 인수명
    this.name = name;
    this.age = age;

  }
}

public class This{
  public static void main(String[] args) {
    Person man = new Person("ABC", 123);

    System.out.println("Name : "+man.name);
    System.out.println("Age : "+man.age);
  }
}