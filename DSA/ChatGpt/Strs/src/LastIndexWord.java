import java.util.Scanner;

public class LastIndexWord {
  public static void main(String[] args) {
    //Find the length of last word of the given string
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string :");
    String str=sc.nextLine();
    int i=str.length()-1;
    while(i>=0 && str.charAt(i)==' '){
      i--;
    }

    int count=0;
    while(i>=0 && str.charAt(i)!=' '){
      count++;
      i--;
    }
    System.out.print("The length of the last word of the string is : "+count);
  }
}
