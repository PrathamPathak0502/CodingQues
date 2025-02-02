//using java Create a new file and print output as "new file created"
import java.io.File;
import java.io.IOException;

public class CreateFile {

  public static void main(String[] args) {
    try {
     
      String fileName = "new_file.txt";
      File file = new File(fileName);

      
      boolean created = file.createNewFile();

      if (created) {
        System.out.println("New file created: " + fileName);
      } else {
        System.out.println("File already exists: " + fileName);
      }
    } catch (IOException e) {
      System.out.println("Error creating file: " + e.getMessage());
    }
  }
}
