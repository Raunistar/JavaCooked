import java.util.Scanner;

public class CheckPlaindrome {
  public static boolean checkPlaindrome(int number){
    int reverseNumber=0;
    int originalNumber=number;// to keep the original user input safe from becoming 0
    //reversing the original number
    while (number>0){
      int digits=number%10;
      reverseNumber=(reverseNumber*10)+digits;
      number=number/10;
    }
    // comapring the reversed and original number
    if (reverseNumber==originalNumber)
    {
      return true;
    }else {
      return false;
    }
  }
  // output check
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a number to check [palindrome]: ");
    int number=sc.nextInt();
    System.out.print(checkPlaindrome(number));
  }
}
