import java.lang.*;

public class Pattern16{
    public static void main(String args[])
    {
        int n=5;
        int ascii=65;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+(char)ascii);
            }
            System.out.println();
            ascii++;
        }
    }
}