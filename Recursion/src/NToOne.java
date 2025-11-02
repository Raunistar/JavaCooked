import java.util.Scanner;

public class NToOne {

    public static void printOneToN(int n){
      if (n<=0)
      {
        return;
      }

      System.out.print(n+" ");
      printOneToN(n-1);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the value of N: ");
      int N = sc.nextInt();

      printOneToN(N);
    }
}
