import java.util.*;
public class DuplicateValues {
    static void print(int arr[]){
        int l = arr.length;
        for(int i = 0; i< l; i++){
            for(int j =i+1; j< l; j++){
                 if(arr[i] == arr[j]){
                    System.out.print(arr[j] + " ");
                 }
            }
        }
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter" +n+ "elements: ");
        for(int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");   
        } 
        System.out.println(); 
        print(arr);
    }
}
