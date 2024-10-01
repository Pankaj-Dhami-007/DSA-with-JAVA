import java.util.*;
public class EvenOddNo {
    static void print(int arr[]){
        int n = arr.length;
        System.out.println("Even No: ");
        for(int i =0; i<n; i++){
            if(arr[i] % 2 == 0){
                System.out.print(+arr[i]+ " ");
            }
        }
        System.out.println();
        System.out.println("Odd No: "); 
        for(int i =0; i<n; i++){
            if(arr[i] % 2 != 0){
                System.out.print(+arr[i]+ " ");
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
            print(arr);
    }
}
