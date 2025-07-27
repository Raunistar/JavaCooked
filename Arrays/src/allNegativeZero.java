import java.util.Scanner;

public class allNegativeZero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length of the array: ");
    int length = sc.nextInt();
    int[] arr = new int[length];

    //taking user input
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < length; i++) {
      arr[i] = sc.nextInt();
    }
    int temp;
    //printing the array and swaping the index 0th element with last element.
    for (int i=0;i<arr.length;i++){
      temp=arr[0];
      arr[0]=arr[length-1];
      arr[length-1]=temp;

      //swaping the negative elements with zero

      if (arr[i]<0){
        arr[i]=0;
      }
      System.out.println(arr[i]);

    }
  }
}
