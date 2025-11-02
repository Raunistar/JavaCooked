import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number to reverse: ");
    int number=sc.nextInt();
    int reverseNumber=0;
    int originalNumber=number;// to keep the original user input safe from becoming 0
    while (number>0){
      int digits=number%10;
      reverseNumber=(reverseNumber*10)+digits;
      number=number/10;
    }
    System.out.print("Reverse of the given number is "+ reverseNumber);
  }
}
