
import java.io.*;

class OutputStreamWriterEx {
  public static void main(String[] args ) {
    try {
      String filename = args[0];
      // Open Binary file 
      FileOutputStream fout = new FileOutputStream(filename);
      //Print Binary Data -> String
      OutputStreamWriter out = new OutputStreamWriter(fout);

      String han = "가나다라";
      out.write(han);

      out.close();


    }catch (Exception e) {
      System.out.println("No file founded");
    }
  }
}