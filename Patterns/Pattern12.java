import java.lang.*;

public class Pattern12{
    public static void main(String args[])
    {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            int l=1,r=i;
            for(int j=1;j<=2*n;j++)
            {
                if(j<=i)
                {
                    System.out.print(l);
                    l++;
                }
                else if(j>=((2*n-i)+1))
                {
                    System.out.print(r);
                    r--;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}