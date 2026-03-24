
import java.util.Scanner;

public class FirstNonRepeatingChar {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string:");
    String str=sc.nextLine().toLowerCase();

    int[] freq=new int[26];

    for (int i = 0; i < str.length(); i++) {
      freq[str.charAt(i) - 'a']++;
    }

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (freq[c - 'a'] == 1) {
        System.out.println("First non-repeating: " + c);
        return;
      }
    }

    System.out.println("No non-repeating character found.");
  }
}
