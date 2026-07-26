//Reverse a number

import java.lang.*;
import java.util.*;

public class Problem03{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.print(false);
            return;
        }
        int t=n;
        int r = 0;
        while(n!=0)
        {
            int d = n%10;
            r=r*10+d;
            n/=10;
        }
        if(t==r)
            System.out.println(true);
        else
            System.out.println(false);
    }
}