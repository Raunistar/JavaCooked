import java.util.Scanner;

public class ReeverseArray {
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
    //printing array in reverse
    System.out.print("The elements in reversed order : ");
    for(int i= arr.length-1;i>=0;i--){
      System.out.print(" "+arr[i]);
    }
    System.out.println(" ");
    // checking if array is sorted in ascending order
    boolean isSorted = true;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        isSorted = false;
        break;
      }
    }

    if (isSorted) {
      System.out.println("✅ The given array is sorted in ascending order.");
    } else {
      System.out.println("❌ The given array is not sorted in ascending order.");
    }
  sc.close();
  }
}
