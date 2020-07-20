
import java.io.*;

class WriteBin {
  public static void main(String[] args ) {
    try {
     FileOutputStream out = new FileOutputStream(args[0]);
      byte x;
      for(x = 48; x <= 57; x++)
        out.write(x);
      out.write('\n');
      for(x = 65; x<=90; x++)
        out.write(x);

      out.close();
      }catch (Exception e){ //  IOException 
      System.out.println("Please enter a file");
    }
  }
}