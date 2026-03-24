import java.util.Scanner;

public class RemoveSpaces {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the sentence : ");
    String str=sc.nextLine();
    if (str.length()==0){
      System.out.print("Empty string!!");
      return;
    }
    //creation of stringbuilder
    StringBuilder sb=new StringBuilder(str);

    //traverse through the strings word
    for (int i=0;i<sb.length();i++){
      if (sb.charAt(i)==' '){
        sb.deleteCharAt(i);//delete the whitespaces
        i--;//to change the index
      }
    }
    String newSentence = sb.toString();
    System.out.print("The sentence without Whitespaces is: "+newSentence);
  }
}
