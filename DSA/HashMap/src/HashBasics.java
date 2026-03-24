import java.util.HashMap;
import java.util.HashSet;

public class HashBasics {
  public static void main(String[] args) {
    //The fundamentals operation using hashmap and hashset
    //-----syntax of hashmap and hashset
    HashMap <String,Integer> map=new HashMap<>();//it works as key-value pair
    HashSet <Integer> set=new HashSet<>();//It only takes key

    //Map methods
    map.put("Licchie",5);//add or update the key value pair
    map.put("apple",10);
    map.put("Grapes",15);
    System.out.println( map.get("Licchie"));//return value for key if present or null

    map.remove("apple"); //removes entery by key if present or null

    System.out.println(map.containsKey("Licchie"));//return true or false

    System.out.println(map.size());//returns the numbers of enteries
    System.out.println(map.isEmpty());//true if its empty
    map.putIfAbsent("Mango",10);
    System.out.println(map.size());
    System.out.println(map);


  }
}
