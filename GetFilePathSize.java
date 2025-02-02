//write a java program to get file name and file path
import java.io.File;

public class GetFilePathSize {

  public static void main(String[] args) {
    String filePath = "abc.txt";  
    File file = new File(filePath);

    if (file.exists()) {
      String fileName = file.getName();
      String path = file.getAbsolutePath();
      long sizeInBytes = file.length(); 

      System.out.println("File name: " + fileName);
      System.out.println("File path: " + path);
      System.out.println("File size: " + sizeInBytes + " bytes");

      
   
    } else {
      System.out.println("File does not exist: " );
    }
  }

}
