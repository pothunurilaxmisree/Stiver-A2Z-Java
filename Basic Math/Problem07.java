//Count All digits of a number

import java.lang.*;
import java.util.*;

public class Problem07{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==0)
            System.out.println(true);
        else
            System.out.println(false);
    }
}