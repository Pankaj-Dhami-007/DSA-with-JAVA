// Second largest and second minimum
/*
 algo_< 1= find max no
        2= mark all max as -infinite
        3= find max again 
 */
public class ArrayQ3 {
    static int secondMax(int arr[]){
        int n = arr.length;
        int max = findMax(arr);
       for(int i =0; i<n; i++){
        if(arr[i] == max){
           arr[i] = Integer.MIN_VALUE;
        }
       }
       
    int secondMax = findMax(arr);

      return secondMax;
    }
    static int findMax(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i =0; i< n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;    }
    public static void main(String args[]){
        int arr[] = {5, 7, 3, 9, 4, 1};
        System.out.println("Second Max: "+ secondMax(arr));
    }
}
