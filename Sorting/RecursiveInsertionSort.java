import java.util.*;
import java.lang.*;

public class RecursiveInsertionSort{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        } 

        insertionSort(arr,1,n);

         for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int arr[],int i,int n){
        if(i==n){
            return;
        }
        int j = i-1;
        int key = arr[i];
        while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        insertionSort(arr,i+1,n);
    }
}