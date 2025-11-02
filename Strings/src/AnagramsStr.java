import java.util.*;

public class AnagramsStr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your input: ");
    String str1 = sc.nextLine();
    System.out.print("Enter your input: ");
    String str2 = sc.nextLine();

    // Clean the strings
    str1 = str1.replaceAll("\\s+", "").toLowerCase();
    str2 = str2.replaceAll("\\s+", "").toLowerCase();

    // Early check
    if (str1.length() != str2.length()) {
      System.out.println("False! Strings are not anagrams.");
      return;
    }

    // Convert and sort
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    // Final check
    if (Arrays.equals(arr1, arr2)) {
      System.out.println("True! Strings are anagrams.");
    } else {
      System.out.println("False! Strings are not anagrams.");
    }
  }
}
