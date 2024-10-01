/*
 Q--> largest and minimum element
 */

public class ArrayQ2 {
    static int findMax(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }
    static int findMin(int arr[]){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
         int arr[] = {5, 7, 3, 9, 4, 1};
         System.out.println("max value: " +findMax(arr));
         System.out.println("min value: " +findMin(arr));
    }
}
