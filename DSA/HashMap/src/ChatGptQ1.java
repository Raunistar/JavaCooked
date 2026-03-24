import java.util.HashMap;

public class ChatGptQ1 {
  public static void main(String[] args) {
    //create a hashmap
    HashMap<String , Integer> map=new HashMap<>();
    map.put("Apple",10);
    map.put("Mango",null);
    map.put("Banana",15);

    System.out.println(map.get("Mango"));
    System.out.println(map.size());
    System.out.println(map.containsKey("Orange"));

    //q2......
//    map.replace("Mango",50);
    System.out.println(map);
    // q3.....
    map.remove("Banana");
    System.out.println(map.isEmpty());
    System.out.println(map.containsKey("Banana"));
    System.out.println(map);
  }
}
