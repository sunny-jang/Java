
import java.io.*;

class ReadText {
  public static void main(String[] args ) {
    try {
     FileReader in = new FileReader(args[0]);
     int c;
     String s = new String();
     while((c = in.read()) != -1) {
       s = s + (char)c;
     }

     System.out.print(s);
     in.close();
    }catch (IOException e1){
      System.out.println("There is no file");
    } finally {
      System.out.println("Please enter files");
    }
  }
}