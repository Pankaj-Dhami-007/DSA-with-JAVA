import java.util.HashMap;

public class HashMap_3 {
    static void freq(int arr[]){
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
       int maxfreq = 0;
       int anskey = -1;
       for(int key : map.keySet()){
                if(map.get(key) > maxfreq){
                 maxfreq = map.get(key);
                 anskey = key;   
                }
       }
       System.out.printf("%d has max freq and it occurs %d times",anskey, maxfreq);
    }
    public static void main(String args[]){
        int arr[] = {1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4};
        freq(arr);
    }
}
