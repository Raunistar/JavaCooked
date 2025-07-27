import java.util.Scanner;
public class ArraysOp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length of the array: ");
    int length = sc.nextInt();

    int[] arr = new int[length];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < length; i++) {
      arr[i] = sc.nextInt();
    }

    int maxElement = Integer.MIN_VALUE;
    int secondLargest=Integer.MIN_VALUE;
    int minElement = Integer.MAX_VALUE;
    int secondSmallest=Integer.MAX_VALUE;
    int sum = 0;

    System.out.println("\nEven and Odd Elements:");
    for (int i = 0; i < length; i++) {
      secondLargest = maxElement;
      sum += arr[i];

      // Finding max
      if (arr[i] > maxElement) {
        maxElement = arr[i];
      }
      //Finding 2nd Largest
      else if (arr[i]<maxElement && arr[i]>secondLargest){
        secondLargest=arr[i];
      }
      // Finding min
      if (arr[i] < minElement) {
        secondSmallest = minElement;
        minElement = arr[i];
      }
      //Finding 2nd Smallest
      else if (arr[i]>minElement && arr[i]<secondSmallest){
        secondSmallest=arr[i];
      }
      // Checking Even/Odd
      if (arr[i] % 2 == 0) {
        System.out.println("Even: " + arr[i]);
      } else {
        System.out.println("Odd: " + arr[i]);
      }
    }

    System.out.println("\nSummary:");
    System.out.println("Maximum Element: " + maxElement);
    System.out.println("2nd largest Element: " + secondLargest);
    System.out.println("Minimum Element: " + minElement);
    System.out.println("2nd smallest Element: " + secondSmallest);
    System.out.println("Sum of All Elements: " + sum);

    sc.close();
  }
}
