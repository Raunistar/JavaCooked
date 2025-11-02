import java.util.Scanner;

public class PrintingName {
  public static void printName(String name, int times) {
    // Base case
    if (times == 0) {
      return;
    }

    // Work
    System.out.println(name);

    // Recursive call with smaller problem
    printName(name, times - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = sc.nextLine();

    System.out.print("How many times to print? ");
    int n = sc.nextInt();

    printName(name, n);
  }
}
