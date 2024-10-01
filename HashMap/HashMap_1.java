import java.util.HashMap;

public class HashMap_1 {
    public static void main(String args[]){
        int arr[] = {1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element : arr){
            if(!map.containsKey(element)){
               map.put(element, 1);
            }
            else{
                map.put(element, map.get(element) +1);
            }
        }
        System.out.println(map.entrySet());
    }
}
