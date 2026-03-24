import java.util.*;

public class Permutations {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();

    //edge cases
    if (n==1){
      System.out.println(1);
      return;
    }

    //No solution Case for n=2 or n=3
    if (n==2 || n==3){
      System.out.println("No Solution!");
      return;
    }
    //loop to print evens first
    for (int i=1;i<=n;i++){
      if (i%2==0){
        System.out.print(i+" ");
      }
    }
    //loop to print odd first
    for (int i=1;i<=n;i++){
      if (i%2!=0){
        System.out.print(i+" ");
      }
    }
  }
}
