import java.lang.*;
import java.util.*;

public class Problem01{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        fun(1,n);
    }

    public static void fun(int i, int n){
        if(i>n){
            return;
        }
        System.out.println("Striver A2Z DSA Course");  
        fun(i+1,n);
    }
}