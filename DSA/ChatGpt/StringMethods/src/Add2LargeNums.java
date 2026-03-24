import java.util.Scanner;

public class Add2LargeNums {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the first num:");
    String num1=sc.nextLine();
    System.out.print("Enter the second num:");
    String num2=sc.nextLine();


    int i = num1.length() - 1;
    int j = num2.length() - 1;
    int carry = 0;

    StringBuilder sb = new StringBuilder();

    while (i >= 0 || j >= 0 || carry > 0) {

      int sum = carry;

      if (i >= 0) sum += num1.charAt(i) - '0';
      if (j >= 0) sum += num2.charAt(j) - '0';

      sb.append(sum % 10);

      carry = sum / 10;

      i--;
      j--;
    }

    String result= sb.reverse().toString();
    System.out.print("The sum is : "+result);
  }
}
