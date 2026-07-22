import java.lang.*;

public class Pattern09{
    public static void main(String args[])
    {
        int i,j,k;
        int n=5;
        for( i=1;i<=2*n;i++)
        {
            if(i<=n){
            for( j=1;j<=(5-i);j++)
            {
                System.out.print(" ");
            }
            for( k=1;k<=2*i-1;k++)
            {
                System.out.print("*");

            }
            System.out.println();
            }
            else{
                    for( k=1;k<i-n;k++)
            {
                System.out.print(" ");

            }
            for( j=1;j<=2*(2*n-i)+1;j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
            }
        }
    }
