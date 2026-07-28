import java.util.*;
import java.lang.*;

public class Problem08{
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n==0|| n==1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

}