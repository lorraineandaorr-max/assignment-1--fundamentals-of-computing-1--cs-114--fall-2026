import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    System.out.println("Base Conversion Program");

    Scanner input = new Scanner(System.in);

    System.out.print("Please enter a base (3-9): ");
    int base = input.nextInt();

    // Calculate the largest 4-digit number for the chosen base
    int maxNumber = (int) Math.pow(base, 4) - 1;

    System.out.println();
    System.out.println("The maximum, 4-digit, base 10 number in base "
            + base + " is " + maxNumber + ".");

    System.out.print("Now, enter a base 10 number in the range 0 to "
            + maxNumber + " to convert: ");
    int number = input.nextInt();

    // Convert the base 10 number to the chosen base
    int digit1 = number / (base * base * base);
    int remainder1 = number % (base * base * base);

    int digit2 = remainder1 / (base * base);
    int remainder2 = remainder1 % (base * base);

    int digit3 = remainder2 / base;
    int digit4 = remainder2 % base;

    System.out.println();
    System.out.println(number + " (base 10) = "
            + digit1 + digit2 + digit3 + digit4
            + " (base " + base + ")");

    input.close();
  }
}

    