import java.util.HashMap;

public class HashMap_2 {
    public static void main(String args[]){
        int arr[] = {1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
       for(int i =0; i<n; i++){
            if(map.containsKey(arr[i])){ // true
                map.put(arr[i], map.get(arr[i]) +1);
            }
            else{
                map.put(arr[i], 1);
            }
       }

       for(int key : map.keySet()){
                if(map.get(key) > n/3){
                 System.out.println(key);   
                }
       }
    }
}
