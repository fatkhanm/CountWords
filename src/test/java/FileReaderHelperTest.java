import Helper.FileReaderHelper;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class FileReaderHelperTest {

  @Test(expected = IOException.class)
  public void readFromFileError() throws IOException {
    FileReaderHelper.readFromFile("");

  }

  @Test
  public void readFromFileSuccess() throws IOException {
    String expected = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. ";
    String actual = FileReaderHelper.readFromFile("src/main/resources/test.txt");
    Assert.assertEquals(expected,actual);

  }

}
