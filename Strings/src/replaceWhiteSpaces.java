import java.util.Scanner;

public class replaceWhiteSpaces {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a Sentence : ");
    String str=sc.nextLine().trim();//used to trim white spaces

    String modified = str.replaceAll("\\s+", "-");
    System.out.println("string after replacing whitespaces with hyphen : "+modified);

  }
}
