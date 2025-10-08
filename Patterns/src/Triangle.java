import java.util.*;
public class Triangle {
  public static void main(String[] args) {
    //Take user input
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no. of rows: ");
    int n=sc.nextInt();

    //for loop for rows of pattern
    for (int i = 1; i <=n ; i++) {
      //to print n-1 spaces
      for (int j = 1; j <=n ; j++) {
        System.out.print(" ");
      }
      //to print 2*i-1 "*"
      for (int j = 1; j <=i; j++) {
        System.out.print(j);//to repeat the no. rplace j with i.
      }
      //New line after each row
      System.out.println();
    }
  }
}
