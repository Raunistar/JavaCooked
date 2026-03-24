import java.util.*;

public class TargetSum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length:");
    int n=sc.nextInt();
    System.out.print("Enter target: ");
    int target=sc.nextInt();
    int [] arr=new int[n];
    // Step 1 - fill array first
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
// Step 2 - then apply two pointers
    int left = 0, right = n - 1;

    boolean found = false;

    while (left < right) {
      int sum = arr[left] + arr[right];

      if (sum == target) {
        System.out.println("Found: " + arr[left] + " + " + arr[right]);
        found = true;
        break;
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }

    if (!found) System.out.println("No pair found.");
  }
}
