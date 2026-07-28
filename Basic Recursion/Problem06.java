import java.util.*;
import java.lang.*;

public class Problem06{
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        reverse(0,arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int i,int arr[],int n){
        if(i>=n/2)
        {
            return;
        }
        swap(arr,i,n-i-1);
        reverse(i+1,arr,n);
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp;
        temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}