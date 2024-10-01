public class MissingNo {
    static int check(int arr[]){
        int n = arr.length;
        int l = n+1;
        int sum = 0;
        int totalSum = l*(l+1)/2;
         for(int i =0; i<n; i++){
            sum += arr[i];
         }
        return totalSum - sum;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 6};
         System.out.println(" Missing No is: "+check(arr));
    }
}
