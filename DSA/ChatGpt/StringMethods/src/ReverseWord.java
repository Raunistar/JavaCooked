import java.util.Scanner;

public class ReverseWord {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter word to reverse : ");
    String str= sc.nextLine();
    //edge case handled here
    if(str.length()==0){
      System.out.println("Empty string!!!");
      return;
    }
    //create the stringbuilder
    StringBuilder sb= new StringBuilder();
//    sb.reverse();//common way to reverse an string

    //using for loop traversal method
    for (int i=str.length()-1;i>=0;i--){
      sb.append(str.charAt(i));
    }
    String reverseWord=sb.toString();
    System.out.print("The reversed word is : "+ reverseWord);
  }
}
