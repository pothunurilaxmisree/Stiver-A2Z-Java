import java.util.*;
import java.lang.*;

public class SelectionSort{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        } 

        for(int i=0;i<n-1;i++)
        {
            int m = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[m])
                {
                    m = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[m];
            arr[m]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}