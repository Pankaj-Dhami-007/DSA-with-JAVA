/*
 Q--> Given an array 'a' consisting of integer . return the first value that is repeating in this array.
 if no value is repeated return -1.
 */
public class ArrayQ4 {
    static int firstRepeatingNo(int arr[]){
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j = i+1;j<n; j++){// pick first no
                if(arr[i] == arr[j]){
                    return arr[i];// return means method end
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
         int arr[] = {1, 5, 4, 3, 6 , 3, 4};
         int num = firstRepeatingNo(arr);
         System.out.println(num);
    }
}
