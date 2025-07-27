import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the length of the array: ");
      int length = sc.nextInt();

      int[] arr = new int[length];
      System.out.println("Enter the elements of the array:");
      for (int i = 0; i < length; i++) {
        arr[i] = sc.nextInt();
      }
     boolean isPresent=false;
      System.out.println("Enter the number you want to search : ");
      int num=sc.nextInt();
      for (int i=0;i<arr.length;i++){
        if(arr[i]==num){
          isPresent=true;
        }
      }
      if (isPresent){
      System.out.println("The  element "+num+" is present in the given array.");
    }else{
    System.out.println("the given element is not in the array.");
  }
  }
  }
