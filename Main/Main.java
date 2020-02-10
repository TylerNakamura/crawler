import java.io.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Initializing");

    // Read in Starter URLs
    File file = new File("starter_urls.txt");
    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      String st;
      while ((st = br.readLine()) != null)
        System.out.println(st);
    }
    catch(Exception e) {
        System.err.print("dammit");
    }
  }
}
