import java.util.*;
public class InvertedNumber {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no. of rows: ");
    int n=sc.nextInt();

    //loop for row
    for (int i=n;i>=1;i--){
      //loop for column
      for (int j=1;j<=i;j++){
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
