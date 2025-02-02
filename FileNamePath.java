//write a java program to get file name and file path
import java.io.File;

public class FileNamePath {

  public static void main(String[] args) {
    String fileName = "abc.txt";
    File file = new File(filePath);

    if (file.exists()) {
      String fileName = file.getName();
      String path = file.getAbsolutePath(); 
      System.out.println("File name: " + fileName);
      System.out.println("File path: " + path);
    } else {
      System.out.println("File does not exist: " + filePath);
    }
  }
}
