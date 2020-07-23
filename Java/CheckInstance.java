class Amimal {
  //Nothing
}

interface Test {

}

class Pet extends Amimal {
  //Nothing
}

class Dog extends Pet implements Test{
  //Nothing
}



class CheckInstance {
  public static void main(String[] args) {
    Dog odog = new Dog();

    if(odog instanceof Amimal) {
      System.out.println("odog은 Animal의 오브젝트이다.");
    }

    if(odog instanceof Pet){
      System.out.println("odog은 Pet의 오브젝트이다.");
   }

   if(odog instanceof Dog) {
    System.out.println("odog은 Dog의 오브젝트이다.");
  }

  if(odog instanceof Test) {
    System.out.println("odog은 Test의 오브젝트이다.");
  } // Interface를implement 한 것도 포함 
   } 
}