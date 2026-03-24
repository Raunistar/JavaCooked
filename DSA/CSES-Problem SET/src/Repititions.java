import java.util.*;

public class Repititions {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string Contains (A/a,C/c,T/t,G/g):");
    String str =sc.nextLine().toLowerCase();
    int count=1;
    int length=1;
    for (int i=0;i<str.length()-1;i++){
      if (str.charAt(i)==str.charAt(i+1)){
        count++;
        if (count>length){
          length=count;
        }
      } else {
        count =1;
      }
    }
    System.out.println("The longest substring is :"+length);
  }
}
