import java.util.*;
import java.lang.*;

public class LeftRotateByOne{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int first=arr[0];
        int i=1;
        while(i<n){
            arr[i-1]=arr[i];
            i++;
        }
        arr[n-1]=first;

        for(int j:arr){
            System.out.print(j+" ");
        }
    }
}