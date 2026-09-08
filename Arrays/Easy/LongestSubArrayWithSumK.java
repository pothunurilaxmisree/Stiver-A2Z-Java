import java.util.*;

public class LongestSubArrayWithSumK{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();

        int l=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==k){
                    l=Math.max(l,j-i+1);
                }

            }
        }
        System.out.println(l);
    }
}