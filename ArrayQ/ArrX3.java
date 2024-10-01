//Q-->  Find the total no of pair in array whose sum is equal to given value x

public class ArrX3 {
    static int targetSum(int arr[], int x, int n){
        
        int count = 0;
        for(int i =0; i<n; i++){// first no pick
           for(int j = i+1; j<n; j++){
              if(arr[i] + arr[j] == x){
                count++;
              }
           } 
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {4, 6, 3, 5, 8, 2};
        int n = arr.length;
        
        System.out.println(targetSum(arr, 7, n));
    }
}
