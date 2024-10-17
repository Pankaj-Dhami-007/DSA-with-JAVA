// Sorted array

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class DUplicateValueArray {

    static int deleteDuplicateValues(int arr[]){
         int current = arr[0];
         int count = 1;//count keeps track of the index for unique elements.
         for(int i = 1; i< arr.length; i++){
            if(current == arr[i]){
              continue;
            }
            else{
                arr[count] = arr[i];
                current = arr[i];
                count++;
            }
         }
         return count;
    }

    static List<Integer> duplicateRemove(int arr[]){
        List<Integer> list = new ArrayList<>();
        if(arr.length == 0) return list;
        list.add(arr[0]);

        for(int i =1; i< arr.length; i++){
            if(arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }
        return list;
    }


    static HashSet<Integer> removeDuplicate(int[] arr){
       HashSet<Integer> set = new HashSet<>();
       for(int i =0; i< arr.length; i++){
        set.add(arr[i]);      
    }
    return set;
}
    public static void main(String[] args) {
        int num[] = {0, 0, 1, 1, 2, 2, 3, 3, 4, 5};

        // HashSet<Integer> set = removeDuplicate(num);
        // System.out.print("[");
        // int count = 0;
        // for (int key : set) {
        //     System.out.print(key);
        //     count++;
        //     if(count < set.size()){
        //         System.out.print(", ");
        //     }
        // }
        // System.out.println("]");

        // List<Integer> result = duplicateRemove(num);
        // System.out.println(result);

        System.out.println(deleteDuplicateValues(num));
    }
}
