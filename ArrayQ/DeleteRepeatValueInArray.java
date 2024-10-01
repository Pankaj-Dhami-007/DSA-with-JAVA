import java.util.*;
public class DeleteRepeatValueInArray {
    static int[] delete(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        int ans[] = new int[n];
        ans[0] = arr[0];
        int j = 1;
        for(int i = 1; i< n; i++){

            if(arr[i] != arr[i-1]){
                ans[j] = arr[i];
                j++;
            }
        }
    
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " +n+ " elements: ");
        for(int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        int result[] = delete(arr);
        for(int i =0; i< result.length; i++){
            System.out.println(result[i]);
        }
        
    }
}
