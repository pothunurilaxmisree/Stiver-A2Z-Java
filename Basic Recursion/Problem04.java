import java.util.*;
import java.lang.*;

public class Problem04{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

       int sum = sum(n);
       System.out.println(sum);
    }
   public static int sum(int n)
    {
        if(n==1)
        {
            return n;
        }     
        return n+sum(n-1); 
    }
}