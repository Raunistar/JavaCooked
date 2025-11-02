import java.util.Scanner;

public class OneToN {
  public static void printOneToN(int current ,int n){
    if (current>n)
    {
      return;
    }

    System.out.print(current+" ");
    printOneToN(current+1,n);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the value of N: ");
    int N = sc.nextInt();

    printOneToN(1,N);
  }
}
