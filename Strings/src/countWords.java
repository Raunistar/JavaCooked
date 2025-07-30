import java.util.Scanner;

public class countWords {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a Sentence : ");
    String str=sc.nextLine().trim();//used to trim white spaces

      if (str.isEmpty()) {
        System.out.println("Word count: 0");
      } else {
        String[] words = str.split("\\s+"); // split by 1 or more spaces
        System.out.println("Word count: " + words.length);
      }
  }
}
