
import java.io.*;

class WriteText {
  public static void main(String[] args ) {
    try {
     FileWriter out = new FileWriter(args[0]);
     int a = 10, b =5;
     out.write("add : ");
     out.write(a + "+" + b +" = " + (a+b) + "\n");

     out.close();
     }catch (Exception e){
      System.out.println("Please enter a file");
    } 
  }
}