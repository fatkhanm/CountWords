package Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class FileReaderHelper {

  public static String readFromFile(String filePath) throws IOException {
    StringBuilder sb = new StringBuilder();
    try {
      BufferedReader reader = new BufferedReader(new FileReader(filePath));
      String line;
      while ((line = reader.readLine()) != null) {
        sb.append(line).append(" ");
      }
    }catch (IOException e){
      throw e;
    }
    return sb.toString();
  }
}
