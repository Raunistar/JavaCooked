import java.util.Scanner;

public class digitCount {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number to count the digits: ");
    int number=sc.nextInt();
    int count=0;
    int newNum=number;
    while (number>0){
      newNum=number%10;
      count++;
      number=number/10;
    }
    System.out.println("No. of digits in given number is : "+count);
  }
}
