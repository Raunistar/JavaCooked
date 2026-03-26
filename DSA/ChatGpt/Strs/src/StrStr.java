import java.util.Scanner;

public class StrStr {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the haystack: ");
    String haystack = sc.nextLine().toLowerCase();

    System.out.print("Enter the needle: ");
    String needle = sc.nextLine().toLowerCase();

    int h = haystack.length();
    int n = needle.length();

    boolean found = false;

    for (int i = 0; i <= h - n; i++) {

      int j = 0;

      while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
        j++;
      }

      if (j == n) {
        System.out.println("Found at index: " + i);
        found = true;
        break; // stop after first match
      }
    }

    if (!found) {
      System.out.println("Not found (-1)");
    }
  }
}
