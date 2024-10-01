//Q--> Find the unique no in a gien Array where all the element are being repearted twice with one value being unique
/*
 arr = [1 2 3 4 2 1 3]
 ans = 4
 valid for only +ve values

 alo...1.Traverse all point
       2.equal pairs -> mark -1
       3.traverse array again , value > 0 is our ans
 */
public class ArraysQ {
    static int findUnique(int arr[], int n){
        for(int i =0; i< n;i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
       for(int i =0; i< n; i++){
        if(arr[i] > 0){
            ans = arr[i];
        }
       }
       return ans; 
    }
    public static void main(String args[]){
         int arr[] = {1, 2, 3, 4, 2, 1, 3};
         int size = arr.length;
         System.out.println("Unq Element: " +findUnique(arr, size));
    }
}
