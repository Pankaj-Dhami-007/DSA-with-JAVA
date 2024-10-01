//Count the no of occurences of a perticular element x
//Find the last occurence of an element x in a given Array

import java.util.*;
public class ArrX{
    static int lastOccurence(int arr[], int x){
      int lastIdx = -1;
      for(int i =0; i<arr.length; i++){
          if(arr[i] == x){
            lastIdx = i;
          }
      }
      return lastIdx;
    }
    static int countFreq(int arr[], int x){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    static void printArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter" +n+ "elements: ");
        for(int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.println("Enter X");
        int x = sc.nextInt();
        int y =countFreq(arr, x);
        System.out.println(y);
        System.out.println("Last occerence of X: "+lastOccurence(arr, x));
    }
}