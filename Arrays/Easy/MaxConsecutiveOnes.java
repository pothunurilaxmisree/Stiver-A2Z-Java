import java.util.*;

public class MaxConsecutiveOnes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0,maxOnes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                maxOnes = Math.max(maxOnes, count);
            }
            else{
                count=0;
            }
        }
        System.out.println(maxOnes);
    }
}
