import java.util.*;

public class CountFreq {
  //Frequency count
  public static void count_frequency(int[] arr){

    //HashMap declration
    HashMap <Integer,Integer> map=new HashMap<>();

    for (int num:arr){
        map.put(num,map.getOrDefault(num,0)+1);
      }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " → " + entry.getValue());
      if(entry.getValue().equals(1)){
        System.out.println(entry.getKey());
      }
    }
  }

  //First repeating key
  public static void first_repeating_key(int[] arr){
    //HashMap declaration
    HashMap<Integer,Integer> map= new HashMap<>();

    //iteration over array to count the values
    for (int num : arr){
      map.put(num,map.getOrDefault(num,0)+1);
    }
    //iterate to print first non repeating key
    for (int num : arr){
      if (map.get(num)==1){
        System.out.print("First non repeating key : "+ num);
        return;
      }
    }
  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 4, 4, 4};
    count_frequency(arr);
    first_repeating_key(arr);
  }
}
