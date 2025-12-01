import java.util.Scanner;

public class CharFrequency {

  public static String characterFrequency(String str) {
    // create the frequency array
    int[] freq = new int[256];

    // first loop to count occurrences
    for (int i = 0; i < str.length(); i++) {
      freq[str.charAt(i)]++;
    }

    int count = 0;
    char maxCountChar = str.charAt(0);

    // second loop to find max occurring character
    for (int i = 0; i < str.length(); i++) {
      if (freq[str.charAt(i)] > count) {
        count = freq[str.charAt(i)];
        maxCountChar = str.charAt(i);
      }
    }

    // return both character and count
    return maxCountChar + " : " + count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a String: ");
    String str = sc.nextLine();

    System.out.println(characterFrequency(str));
  }
}
