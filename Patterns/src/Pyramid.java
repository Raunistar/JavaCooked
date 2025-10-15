import java.util.*;
public class Pyramid {
  public static void main(String[] args) {
    //Take user input
    Scanner sc=new Scanner(System.in);
    System.out.println(".................... ");
    System.out.print("Enter the no. of rows: ");
    int n=sc.nextInt();

    //for loop for rows of pattern
    for (int i = 1; i <=n; i++) {
      //to print n-1 spaces
      for (int j = 1; j <=n-i ; j++) {
        System.out.print(" ");
      }
      //to print 2*i-1 "*"
      for (int j = 1; j <=2*i-1 ; j++) {
        System.out.print(j);//if we rplace j with i it will repeat the no.
      }
      //New line after each row
      System.out.println();
    }
  }
}
