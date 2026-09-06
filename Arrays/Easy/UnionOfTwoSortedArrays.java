import java.util.*;

public class UnionOfTwoSortedArrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        int i=0,j=0;
        ArrayList<Integer> union = new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                union.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]>arr2[j]){
                if(!union.contains(arr2[j])){
                    union.add(arr2[j]);
                }
                j++;
            }
            else{
                if(!union.contains(arr1[i])){
                    union.add(arr1[i]);
                }
                i++;
            }
        }
        while(i < n){
            if(!union.contains(arr1[i])){
                union.add(arr1[i]);
            }
            i++;
        }
        while(j < m){
            if(!union.contains(arr2[j])){
                union.add(arr2[j]);
            }
            j++;
        }

        System.out.println(union);
    }
}