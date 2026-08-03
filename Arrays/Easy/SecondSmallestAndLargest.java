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

        Arrays.sort(arr);
        //second smallest
        int i=1;
        int ss = -1;
        while(i<n){
            if(arr[i]!=arr[i-1]){
                ss=arr[i];
                break;
            }
            else{
                i++;
            }
        }

        //second largest
        int sl = -1;
        while(n>1){
            if(arr[n-1]!=arr[n-2]){
                sl=arr[n-2];
                break;
            }
            else{
                n--;
            }
        }
        System.out.println("Second Smallest : "+ss+" Second Largest : "+sl);
    }
}