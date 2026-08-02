import java.util.*;
import java.lang.*;

public class QuickSort{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        } 
        qs(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void qs(int arr[], int low,int high){
        if(low>=high){
            return;
        }
        int pi = partition(arr,low,high);

        qs(arr,low,pi-1);
        qs(arr,pi+1,high);
    }
    public static int partition(int arr[], int low, int high) {

    int pivot = arr[low];
    int i = low;
    int j = high;

    while (i < j) {

        while (i <= high - 1 && arr[i] <= pivot)
            i++;

        while (j >= low + 1 && arr[j] > pivot)
            j--;

        if (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;

    return j;
}
}