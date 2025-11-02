import java.util.Scanner;

public class RotateArray {
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
    //left rotate array by 1
    int first = arr[0];
    for (int i = 0; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[arr.length - 1] = first;
    System.out.println("Array after left rotation:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");

    }
  }
}
