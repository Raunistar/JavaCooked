public class SecondLargest {

  /**
   * Finds the second largest element in an array
   * @param arr The input array
   * @return The second largest element, or -1 if it doesn't exist
   */
  public static int findSecondLargest(int[] arr) {
    // Input validation
    if (arr == null || arr.length < 2) {
      return -1;
    }

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int number : arr) {
      if (number > largest) {
        // New largest found, previous largest becomes second largest
        secondLargest = largest;
        largest = number;
      } else if (number > secondLargest && number < largest) {
        // Number is between largest and second largest
        secondLargest = number;
      }
    }

    // Check if we found a valid second largest
    return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
  }

  public static void main(String[] args) {
    // Example usage
    int[] testArray = {12, 35, 1, 10, 34, 1};
    int result = findSecondLargest(testArray);

    System.out.println("Second largest element: " + result);
  }
}
