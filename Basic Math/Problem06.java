//Count All digits of a number

import java.lang.*;
import java.util.*;

public class Problem06{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            ans.add(i);
        }
        System.out.println(ans);
    }
}