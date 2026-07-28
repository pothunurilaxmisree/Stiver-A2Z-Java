import java.util.*;
import java.lang.*;

public class Problem07{
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        
        System.out.println(isPalindrome(0,str,str.length()));
    }
    public static boolean isPalindrome(int i,String str,int n){
        if(i>=n/2)
        {
            return true;
        }
        else if(str.charAt(i) != str.charAt(n-i-1))
        {
            return false;
        }
        return isPalindrome(i+1,str,str.length());
    }

}