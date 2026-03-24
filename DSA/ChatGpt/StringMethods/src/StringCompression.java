import java.util.Scanner;

public class StringCompression {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string : ");
    String str=sc.nextLine().trim().toLowerCase();//to avoid case issue

    //edge cases handled here
    if (str.length()==0){
      System.out.print("The given string length is 0.");
      return;
    }
    //create the stringBuilder
    StringBuilder sb=new StringBuilder();

    //for loop to traverse through the strings chars...
    for (int i=0;i<str.length();i++){

      //a current char to compare with others char in the given string
      char current=str.charAt(i);
      int charCount=1;//same char counter

      //if current char is equal to next char and i+1 is less than the given string length
      while(i+1<str.length()&& str.charAt(i+1)==current){
        charCount++;
        i++;
      }
      sb.append(current);//appending the current char

      //if charCount is more than 1 then append to sb otherwise it will add +1 char unneccessarily
      if(charCount>1){
        sb.append(charCount);
      }
    }
    System.out.print("The compressed string is : "+sb.toString());
  }
}
