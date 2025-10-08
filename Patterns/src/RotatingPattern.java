import java.util.*;
public class RotatingPattern {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no. of rows: ");
    int n=sc.nextInt();
    //for loop for rows of pattern
    for (int i = n; i >=1 ; i--) {
      //to print n-1 spaces
      for (int j = 1; j <=n-i ; j++) {
        System.out.print(" ");
      }
      //to print 2*i-1 "*"
      for (int j = i; j >=1; j--) {
        System.out.print("*");
      }
      //New line after each row
      System.out.println();
    }
  }
}
