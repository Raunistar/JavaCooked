import java.util.Scanner;

public class OccuranceStr {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a word : ");
    String str=sc.nextLine().trim();//used to trim white spaces

    //counting the frequency of given letter
    System.out.print("Enter a letter to check the frequency: ");
    char letter=sc.next().charAt(0);
    int freq=0;
    char[] arr=str.toCharArray();
    for (int i=0;i<arr.length;i++){
      if (arr[i]==letter){
        freq++;
      }
    }
    if (freq>1){
      
    }
    System.out.print("The given letter has " + freq+" frequency.");
  }
}
