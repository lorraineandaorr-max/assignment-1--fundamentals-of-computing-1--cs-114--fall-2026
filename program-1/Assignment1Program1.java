import java.util.Random;
import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {
    // 1 = part of A, 2 = part of O, 0 = blank
    String[] grid = {
      "0011100222200",
      "0010010200020",
      "000100101200020",
      "0111110200020",
      "1000012000020",
      "100001200020",
      "1000010222200"
    };

    for (String row : grid) {
      StringBuilder line = new StringBuilder();
      for (int i = 0; i < row.length(); i++) {
        char c = row.charAt(i);
        if (c == '1') {
          line.append('A');
        } else if (c == '2') {
          line.append('O');
        } else {
          line.append(' ');
        }
      }
      System.out.println(line.toString());
    }

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    System.out.print("Please enter a 5-character string: ");
    String userString = input.nextLine();

    // Remove the first and last characters
    String trimmedString = userString.substring(1, userString.length() - 1);

    // Reverse the remaining characters
    String reversedString = new StringBuilder(trimmedString)
      .reverse()
      .toString();
    System.out.println("Reversed string: " + reversedString);

    System.out.print("Please enter the temperature in Fahrenheit: ");
    double fahrenheit = input.nextDouble();

    // Convert to Celsius
    double celsius = (fahrenheit - 32) * 5.0 / 9.0;

    // Display the result
    System.out.println("The temperature in Celsius is: " + celsius);

    // Generate a random number between 32 and 16,384
    int randomNumber = random.nextInt(16384 - 32 + 1) + 32;
    System.out.println("Random number generated. Continuing...");
System.out.println();
System.out.println("Your new string is " + celsius + reversedString + randomNumber);
  }
}





 