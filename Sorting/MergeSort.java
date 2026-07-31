import java.util.*;
import java.lang.*;

public class MergeSort{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }

        mergeSort(arr,0,n-1);
        for(int f:arr)
        {
            System.out.print(f+" ");
        }

    }
    public static void mergeSort(int arr[], int low, int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[], int low, int mid,int high){
        ArrayList<Integer> res = new ArrayList<>();
        int l = low;
        int r = mid+1;
        while(l<=mid && r<=high){
            if(arr[l]<=arr[r]){
                res.add(arr[l]);
                l++;
            }
            else{
                res.add(arr[r]);
                r++;
            }
        }
        while(l<=mid){
            res.add(arr[l]);
            l++;
        }
        while(r<=high){
            res.add(arr[r]);
            r++;
        }
        for(int i=low;i<=high;i++){
            arr[i] = res.get(i-low);
        }
    }
}