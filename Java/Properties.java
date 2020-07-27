import java.util.*;

class Properties {
  public static void main(String[] args ) {
    System.out.println(System.getProperty("java.version"));
    System.out.println(System.getProperty("java.vendor"));
    System.out.println(System.getProperty("java.vendor.url"));
    System.out.println(System.getProperty("java.home"));
    System.out.println(System.getProperty("java.class.version"));
    System.out.println(System.getProperty("java.class.path"));
    System.out.println(System.getProperty("java.ext.dir"));
    System.out.println(System.getProperty("os.name"));
    System.out.println(System.getProperty("os.arch"));
    System.out.println(System.getProperty("os.version"));
  }
}