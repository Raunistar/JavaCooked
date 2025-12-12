import java.util.Scanner;

public class StringCompression {
  public static String compressString(String str){
    //handle the edge case
    if (str.length()==0) return "";

    //create the stringbuilder
    StringBuilder sb=new StringBuilder();

    //loop over the string characters to count
    for (int i=0;i<str.length();i++){
      char current=str.charAt(i);//current value of the characters
      int count=1;//initially 1
      //to check the char are same or not to increae the count
      while(i+1<str.length()&& str.charAt(i+1)==current){
        count++;
        i++;
      }
      //append current char
      sb.append(current);
      //append the count value to stringbuilder
      if (count>1){
        sb.append(count);
      }

    }
   //return as string
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a String: ");
    String str = sc.nextLine();

    System.out.println(compressString(str));
  }
}
