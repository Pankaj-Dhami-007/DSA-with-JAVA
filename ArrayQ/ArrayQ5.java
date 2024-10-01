//Q--> reverse an array consisting of int values

public class ArrayQ5 {
    static int[] reverse(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int j =0;
        for(int i = n-1; i>=0; i--){// while loop
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int ans[] = reverse(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }        
}
