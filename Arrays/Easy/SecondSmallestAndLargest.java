import java.util.*;
import java.lang.*;

public class SecondSmallestAndLargest{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int ss = Integer.MAX_VALUE;
        int sl = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<ss && arr[i]!=smallest){
                ss=arr[i];
            }
            if(arr[i]>sl && arr[i]!=largest){
                sl=arr[i];
            }
        }
        System.out.println("Second Smallest : "+ss+" Second Largest : "+sl);
    }
}