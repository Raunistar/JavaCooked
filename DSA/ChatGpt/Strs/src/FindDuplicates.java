import java.util.Scanner;

public class FindDuplicates {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string:");
    String str=sc.nextLine().toLowerCase();

    int[] freq=new int[26];

    for (int i=0;i<str.length();i++){
      char c=str.charAt(i);
      freq[c-'a']++;
    }

    for (int i=0;i<26;i++){
      if (freq[i]>1){
        System.out.println((char)(i + 'a') + " = " + freq[i]);
      }
    }
  }
}
