import java.lang.*;

public class Pattern20{
    public static void main(String args[])
    {
        int n=5;
        int s=8;
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
                System.out.print("*");
           }
           for(int j=1;j<=s;j++)
           {
                System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
                System.out.print("*");
           }
           s-=2;
            System.out.println();
        }
        int sp=2;
        for(int i=1;i<n;i++)
        {
           for(int j=1;j<n-i+1;j++)
           {
                System.out.print("*");
           }
           for(int j=1;j<=sp;j++)
           {
                System.out.print(" ");
           }
           for(int j=1;j<n-i+1;j++)
           {
                System.out.print("*");
           }
           sp+=2;
            System.out.println();
        }

    }
}