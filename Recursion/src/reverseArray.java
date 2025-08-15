import java.util.Scanner;

public class reverseArray {
  public static void ReverseArray(int arr[], int n) {
    if (n == 0) {
      return;
    }
    System.out.print(arr[n - 1] + " ");
    ReverseArray(arr, n - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length of the Array: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print("Elements entered are: ");
    for (int num : arr) {
      System.out.print(num + " ");
    }

    System.out.print("\nThe Reversed array: ");
    ReverseArray(arr, n);
  }
}
