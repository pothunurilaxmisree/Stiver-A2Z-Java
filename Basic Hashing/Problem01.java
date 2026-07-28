import java.util.*;
import java.lang.*;

public class Problem01{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(Integer key : mp.keySet()){
            System.out.println(key + " " + mp.get(key));
        }

    }
}