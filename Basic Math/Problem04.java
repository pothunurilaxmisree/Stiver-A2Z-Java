//Count All digits of a number

import java.lang.*;
import java.util.*;

public class Problem04{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int s=0,gcd=1;
        if(n1>n2)
            s=n2;
        else
            s=n1;
        for(int i = s;i>=1;i--)
        {
            if(n1%i==0 && n2%i==0){
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);
    }
}