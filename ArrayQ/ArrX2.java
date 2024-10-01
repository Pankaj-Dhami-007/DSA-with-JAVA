/*
  Array = [5, 8, 1, 3, 6, 2]
  Smallest = 1
  largest = 8

  output:  [1, 8]
 */
import java.util.Arrays;
public class ArrX2{
    static int[] test(int arr[]){
        Arrays.sort(arr);
        int ans[] = {arr[0], arr[5]};
        return ans;
    }
    public static void main(String[] args){
         int arr[] = {5, 8, 1, 3, 6, 2};
         int ans[] = test(arr);
         for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
         }
         
    }
}
