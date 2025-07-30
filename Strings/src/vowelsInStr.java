import java.util.Scanner;

public class vowelsInStr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String str = sc.nextLine();

    int countVowel = 0;
    int countConso = 0;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (Character.isLetter(ch)) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
          countVowel++;
        } else {
          countConso++;
        }
      }
    }

    System.out.println("Vowels: " + countVowel);
    System.out.println("Consonants: " + countConso);
  }
}
