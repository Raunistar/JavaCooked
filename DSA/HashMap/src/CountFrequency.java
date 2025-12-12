import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

  public static void countFreq(int[] arr, int n) {

    // hashmap to store frequency
    HashMap<Integer, Integer> map = new HashMap<>();

    // store counts
    for (int num : arr) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    // print frequencies
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }

  public static void main(String[] args) {

    int[] arr = {10, 5, 10, 15, 10, 5};
    int n = arr.length;

    // Directly call static method
    countFreq(arr, n);
  }
}
