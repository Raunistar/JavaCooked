import java.util.Scanner;
public class HollowKShape {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no. of rows: ");
    int n=sc.nextInt();
//upper half of the K shape
    for(int i=n;i>=1;i--){
      for (int j=i;j>=1;j--){
        System.out.print(j+" ");
      }
      System.out.println();
    }
    //Lower half of the K shape
    for(int i=2;i<=n;i++){
      for (int j=i;j>=1;j--){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}
