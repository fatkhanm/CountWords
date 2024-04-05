
import Helper.FileReaderHelper;
import Rule.WordRule;
import RulesImpl.CountWordStartWithMRule;
import RulesImpl.MoreThanFiveCharRule;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {
  public static void main(String[] args) {
    while (true) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter '1' to input text via terminal or '2' to input from a file: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

      String text = "";

      switch (choice) {
        case 1:
          System.out.println("Enter the text: ");
          text = scanner.nextLine();
          break;
        case 2:
          System.out.println("Enter the file path: ");
          String filePath = scanner.nextLine();
          try {
            text = FileReaderHelper.readFromFile(filePath);
          } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
          }
          break;
        default:
          System.out.println("Invalid choice.");
      }
      System.out.println("Enter '1' to get num of word start with m or '2' to get words that have char greater than 5: ");
      System.out.println("Enter the rule: ");
      int ruleNum = scanner.nextInt();
      switch (ruleNum) {
        case 1:
          final WordRule countWordStartWithMRule = new CountWordStartWithMRule();
          long count = Arrays
              .stream(text.split(" "))
              .filter(word -> countWordStartWithMRule.rule(word))
              .count();
          System.out.println(String.format("Result: %d", count));
          break;
        case 2:
          final WordRule moreThanFiveCharRule = new MoreThanFiveCharRule();
          List<String> result = Arrays
              .stream(text.split(" "))
              .filter(word -> moreThanFiveCharRule.rule(word))
              .collect(Collectors.toList());
          System.out.println("Result: ");
          result
              .stream()
              .forEach(System.out::println);
          break;
        default:
          System.out.println("Invalid choice.");
      }

    }
  }
}
