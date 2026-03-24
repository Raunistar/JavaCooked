import java.util.Scanner;

public class CountVowels {

  public static void countVowels(String str) {

    if (str.length() == 0) {
      System.out.println("Empty String!!");
      return;
    }

    StringBuilder sb = new StringBuilder(str);

    int countVowel = 0;
    int countConsonant = 0;

    for (int i = 0; i < sb.length(); i++) {

      char ch = sb.charAt(i);

      if (Character.isLetter(ch)) {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
          countVowel++;
        } else {
          countConsonant++;
        }

      }
    }

    System.out.println("Number of vowels: " + countVowel);
    System.out.println("Number of consonants: " + countConsonant);
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    countVowels(str);
  }
}
