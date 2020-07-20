
import java.io.*;

class ReadBin {
  public static void main(String[] args ) {
    try {
     FileInputStream in = new FileInputStream(args[0]);
      int c;
      while((c = in.read()) != -1) {
        // s = s + (char) c;
      System.out.printf("%02X ", c);

      }
 
      in.close();
     }catch (FileNotFoundException e){ //  IOException 
      System.out.println("No file founded");
    } catch(Exception e) {
      System.out.println("Please enter a file");
    }
  }
}