import java.util.*;
public class CharPattern {
  public static void main(String[] args) {
    // You can test with different values
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the rows : ");
    int n=sc.nextInt();

    // Print first row
    for (int i=1;i<=n;i++){
      for (int j=1;j<=n;j++){
        char jthChar=(char)('A'+i-1);
        System.out.print(jthChar);
      }
      System.out.println();
    }

  }
}
