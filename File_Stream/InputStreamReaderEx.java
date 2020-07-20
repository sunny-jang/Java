
import java.io.*;

class InputStreamReaderEx {
  public static void main(String[] args ) {
    try {
      String filename = args[0];
      FileOutputStream out  = new FileOutputStream(filename);
      FileInputStream file = new FileInputStream(filename);
      // Entered Binary -> String
      InputStreamReader in =  new InputStreamReader(file);

      for(byte i = 1; i<=10; i++)
        out.write(i); // Write Binary 1 byte thing into the file

      out.close(); // close it.

      int c;
      while((c = in.read()) != -1) // Read and change binary data to string
        System.out.print(c + "");  // Print string
        //We can get the right data as we used InputStreamReader

    }catch(Exception e) {

    }
  }
}