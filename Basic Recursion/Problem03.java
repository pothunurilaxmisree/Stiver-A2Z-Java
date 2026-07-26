import java.util.*;
import java.lang.*;

public class Problem03{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        fun(n);
    }
   public static void fun(int n)
    {
        if(n<1)
            return;
        System.out.println(n);
        fun(n-1);        
    }
}