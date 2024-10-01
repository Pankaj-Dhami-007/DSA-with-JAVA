import java.util.*;
public class MostFreqInArr {
static int print(int arr[]){
    int max = 0;
    int temp = 0;
    int n = arr.length;
    for(int i =0; i< n; i++){
        int count =0;
        for(int j =0; j<n; j++){
            if(arr[i] == arr[j]){
                count++;
            }
        }
        if(count > max){
            max = count;
            temp = arr[i];
        }
    }
    return temp;

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
        System.out.println(print(arr));
    }
        
}
