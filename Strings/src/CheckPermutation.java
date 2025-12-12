import java.util.Scanner;

public class CheckPermutation {
  public static boolean checkPermutation(String str1,String str2){
    //check if lenght of both strings are equal or not(edge case)
    if(str1.length()!=str2.length()){
      return false;
    }

    //create freq array to store the count / frequency
    int freq[]=new int[256];
    //first for loop for the str1 to count the letters
    for (int i=0;i<str1.length();i++){
      freq[str1.charAt(i)]++;
    }
    //create 2nd for loop for the str2 to reduce the count to check the permutation
    for (int i=0;i<str2.length();i++){
      freq[str2.charAt(i)]--;

      if (freq[str2.charAt(i)]<0){
        return false;//if any other character is present
      }
    }
    return true;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first String: ");
    String str1 = sc.nextLine().toLowerCase();
    System.out.print("Enter the second String: ");
    String str2 = sc.nextLine().toLowerCase();

    System.out.println(checkPermutation(str1,str2));
  }

}
