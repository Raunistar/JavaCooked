import java.util.Scanner;

public class RemoveDuplicates {
  public static String removeDuplicates(String str){
    //edge case handling
    if (str == null || str.length() == 0) return str;
    //create StringBuilder class
    StringBuilder sb=new StringBuilder();
    sb.append(str.charAt(0));//append the first character

    //for loop to iterate and delete duplicates
    for(int i=1;i<str.length();i++){
      if (str.charAt(i)!=sb.charAt(sb.length()-1)){
        sb.append(str.charAt(i));//only append if not same
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the String:");
    String str=sc.nextLine();

    System.out.println(removeDuplicates(str));
  }
}
