import java.util.*;
class Basic{
    static void HashMap(){
        //Syntax
        HashMap<String, Integer> map = new HashMap<>();
        // Adding elements
        map.put("Dhami", 21);
        map.put("Yash", 16);
        map.put("Lav", 17);
        map.put("Harry", 19);

        // Getting value of a Key from the hashmap
        System.out.println(map.get("Dhami"));

        //Changing/Updating value of a key in the hashmap
        System.out.println((map.put("Dhami", 66))); // 21

        //removing a pair from the hashmap
        System.out.println(((map.remove("Lav")))); // 17
        System.out.println(((map.remove("Riya")))); // null

        // Checking if a key is in the hasmap
        System.out.println(map.containsKey("Dhami")); // true

        // adding a new entry only if the new entry does not exist already
        map.putIfAbsent("Ritik", 99); // will entr
        map.putIfAbsent("Yash", 16); // will not enter

        //Get all keys in hashmap
        System.out.println(map.keySet());

        // Get all values in the hashmap
        System.out.println(map.values());

        //Get all entries in the HashMap
        System.out.println(map.entrySet());

        // Traversing all entries of hashmap--- multiple methods
        for(String key: map.keySet()){
            System.out.printf("Age of %s is %d\n", key, map.get(key));
        }

        for(var e : map.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }

    }
    public static void main(String args[]){
        HashMap();
    }
}