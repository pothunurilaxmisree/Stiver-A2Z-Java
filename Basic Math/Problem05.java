//Reverse a number

import java.lang.*;
import java.util.*;

public class Problem05{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int t=n;
        int tep = n;
        int ar=0;
        while(n!=0)
        {
            count++;
            n/=10;
        }
        while(t!=0)
        {
            int d = t%10;
            ar = ar + (int)Math.pow(d,count);
            t=t/10;
        }
        if(tep == ar)
            System.out.println(true);
        else    
            System.out.println(false);
    }
}