import java.util.*;
import java.lang.*;

public class SortedOrNot{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int flag=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=1; i<n;i++){
            if(arr[i-1]>arr[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}