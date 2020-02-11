import java.io.*;

import URLAnalyzer.URLAnalyzer;

class Main {
  public static void main(String[] args) {
    System.out.println("Initializing");

    boolean vflag = false;
    String outputfile = "";
    int i = 0;
    String arg;
    String starter_urls="starter_urls.txt";
    URLAnalyzer thingy = new URLAnalyzer();

    // Parse Command Line Arguments
    // Source: http://journals.ecs.soton.ac.uk/java/tutorial/java/cmdLineArgs/conventions.html
    while (i < args.length && args[i].startsWith("-")) {
          arg = args[i++];

          // use this type of check for "wordy" arguments
          if (arg.equals("-verbose")) {
              System.out.println("verbose mode on");
              vflag = true;
          }
          // use this type of check for arguments that require arguments
          else if (arg.equals("-starter_urls")) {
              if (i < args.length)
                  starter_urls = args[i++];
                  System.out.println("Custom Starter URL File: " + outputfile);
          }
      }

    // Read in starter URLs
    File file = new File(starter_urls);
    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      String st;
      while ((st = br.readLine()) != null)
        System.out.println(st);
    }
    catch(Exception e) {
        System.err.print("ERROR" + e);
    }
  }
}
