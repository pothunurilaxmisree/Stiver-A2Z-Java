import java.util.*;
import java.lang.*;

public class Problem02{
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
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minEl = -1;
        int maxEl = -1;
        for(Integer key : mp.keySet()){
            if(mp.get(key) > max){
                maxEl = key;
                max = mp.get(key);
            }
            if(mp.get(key) < min){
                minEl = key;
                min = mp.get(key);
            }
        }
        System.out.println(maxEl + " " + minEl);

    }
}