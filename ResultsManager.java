import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.nio.file.*;
import java.util.List;

public class ResultsManager {

  public static String fileName = "results.txt";

  public static void record(String name, String gradYear, String height, String result) {
      System.out.println("Writing: Name=" + name + "Graduation Year=" + gradYear + "Height= " + height + " Result=" + result);
    try {
      // Create a FileWriter in append mode (true as the second argument)
      FileWriter fileWriter = new FileWriter(fileName, true);

      // Optional: Wrap FileWriter in a BufferedWriter for better performance
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      // Write the content to the file
      String textToAdd = name.trim() + "," + gradYear.trim() + "," + height.trim() + "," + result;
      bufferedWriter.write(textToAdd + "\n");

      // Close the writer to ensure all data is written and resources are released
      bufferedWriter.close(); // Close BufferedWriter, which also closes FileWriter

      System.out.println("Content appended to " + fileName + " successfully.");

      } catch (IOException e) {
          System.err.println("An error occurred while appending to the file: " + e.getMessage());
          e.printStackTrace();
      }
  }

  

  public static void printResults() {
    //results header text
    final String HEADER = "Name            | Graduation Year |   Height   |   Category";
    System.out.println(HEADER);
    //bar underneath header
    String underscore = "";
    for (int index=0; index< HEADER.length()+5; index++){
      underscore += "_";
    }
    System.out.println(underscore);

    //take in data, output it
    try {
      //formatting - trim the length of name
      final int MAX_NAME_LENGTH = 15;
      final int MAX_GRAD_YEAR_LENGTH = 15;
      final int MAX_HEIGHT_LENGTH = 15;
      List<String> lines = Files.readAllLines(Paths.get("results.txt"));
      String name = "";
      String gradYear = "";
      String height = "";
      String category = "";
      for (String line : lines) {
        String[] parts = line.split(",");
        name = parts[0];
        gradYear = parts[1];
        height = parts[2];
        category = parts[3];
        //add spaces so all names exactly the same length
        if (name.length() > MAX_NAME_LENGTH) {
          name = name.substring(0,MAX_NAME_LENGTH);
        }
        for (int charIndex = name.length(); charIndex<MAX_NAME_LENGTH; charIndex++) {
          name += " "; }
        for (int charIndex = gradYear.length(); charIndex<MAX_GRAD_YEAR_LENGTH; charIndex++) {
          gradYear += " ";}
        for (int charIndex = height.length(); charIndex<MAX_HEIGHT_LENGTH; charIndex++) {
          height += " "; }


        //final line output (name + category)
        String lineOutput = name + "|  " + gradYear + "|  " + height + "|  " + category;
        System.out.println(lineOutput);
        
        }
        
            
    } catch (IOException e) {
          e.printStackTrace();
      }
  }

}
       