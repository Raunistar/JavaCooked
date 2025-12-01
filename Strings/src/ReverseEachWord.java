import java.util.Scanner;

public class ReverseEachWord {
  public static String reverseEachWord(String str){
    //Store each word in an array using split
    String[] words =str.split(" ");
    StringBuilder sb=new StringBuilder();

    //Modern For Loop to reverse each word
    for(String word:words){
      //temp stringbuilder to store reversed word from words array
      StringBuilder temp=new StringBuilder(word);
      temp.reverse();
      sb.append(temp).append(" ");
    }
    return sb.toString().trim();
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a sentence : ");
    String str=sc.nextLine();
    System.out.println( reverseEachWord(str));

  }
}
