import java.util.*;

public class MissingNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }  
        int noOfElements=n+1;
        int totalSum=noOfElements*(noOfElements+1)/2;
        System.out.println(totalSum-sum);
    }
}