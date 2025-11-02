import java.util.Scanner;

public class CompositeNumber {

    public static void print_composite(int n) {
      if (n < 4) {
        System.out.println("No composite numbers up to " + n);
        return;
      }

      boolean compositeFound = false;

      for (int i = 4; i <= n; i++) {
        boolean isComposite = false;

        for (int j = 2; j <= i / 2; j++) {
          if (i % j == 0) {
            isComposite = true;
            break;
          }
        }

        if (isComposite) {
          System.out.println(i);
          compositeFound = true;
        }
      }

      if (!compositeFound) {
        System.out.println("No composite numbers up to " + n);
      }
    }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number to check :");
    int n=sc.nextInt();
    print_composite(n);
  }
  }
