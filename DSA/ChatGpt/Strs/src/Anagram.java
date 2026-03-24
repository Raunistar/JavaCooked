import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter string 1:");
    String str1=sc.nextLine().toLowerCase();
    System.out.print("Enter string 2:");
    String str2=sc.nextLine().toLowerCase();

    int[] freq=new int[26];
    //base case
    if (str1.length()!=str2.length()){
      System.out.println("Not an Anagram.");
      return;
    }

    for (int i=0;i<str1.length();i++){
      char c=str1.charAt(i);
      freq[c-'a']++;
    }

    for (int i=0;i<str2.length();i++){
      char c=str2.charAt(i);
      freq[c-'a']--;
    }

    for (int i=0;i<26;i++){
      if (freq[i]!=0){
        System.out.println("Not an Anagram.");
        return;
      }
    }
    System.out.println("Anagram!");
    }
}
