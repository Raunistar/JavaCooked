import java.util.Scanner;

public class AllSubStrings {

  public static void allSubStrings(String str, String target) {

    String longest = "";
    String shortest = str;  // initialize with full string so we can reduce
    boolean targetFound = false;

    for (int i = 0; i < str.length(); i++) {
      for (int j = i; j < str.length(); j++) {

        String sub = str.substring(i, j + 1);
        System.out.println(sub);

        // Check longest
        if (sub.length() > longest.length()) {
          longest = sub;
        }

        // Check shortest
        if (sub.length() < shortest.length()) {
          shortest = sub;
        }

        // Check if this substring contains given target string
        if (sub.contains(target)) {
          targetFound = true;
        }
      }
    }

    System.out.println("\nLongest substring: " + longest);
    System.out.println("Shortest substring: " + shortest);

    if (target.length() > 0) {
      if (targetFound) {
        System.out.println("A substring containing '" + target + "' exists.");
      } else {
        System.out.println("No substring contains '" + target + "'.");
      }
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a String: ");
    String str = sc.nextLine();

    System.out.print("Enter letters to search in substring: ");
    String target = sc.nextLine();   // if blank → skip

    allSubStrings(str, target);
  }
}
