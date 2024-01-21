import java.util.*;
public class P77_hashmap {
    public static void main(String[] args) {
        //creating hashmap
        HashMap<String,Integer>map = new HashMap<>();

        //insertion in hash map
        map.put("India",120);
        map.put("US", 30);
        map.put("China",150);

        //print hashmap
        System.out.println(map);

        //searching of element in hashmap
        if(map.containsKey("India")){
            System.out.println("key will found");
        }
        else{
            System.out.println("key will not found");
        }

        //get value of key
        System.out.println(map.get("India"));

        //iteration of hashmap
        //iteration type 1
        for(Map.Entry<String,Integer>e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //iteration type 2
        Set<String>keys = map.keySet();
        for(String key : keys){
            System.out.println(key +" "+map.get(key));
        }

        //delete pair from hashmap
        map.remove("China");
        System.out.println(map);

    }
}
