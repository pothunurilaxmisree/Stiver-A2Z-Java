import java.lang.*;

public class Pattern10{
    public static void main(String args[])
    {
        int n = 5;
        for(int i=1;i<2*n;i++)
        {
            if(i<=n){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        else{
            for(int j=2*n-i;j>0;j--)
            {
                System.out.print("*");
            }
                System.out.println();
            }
        }
    }
}