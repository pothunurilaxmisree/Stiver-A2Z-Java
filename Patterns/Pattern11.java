import java.lang.*;

public class Pattern11{
    public static void main(String args[])
    {
        int n=5,flag;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                flag=0;
            }
            else{
                flag=1;
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(flag);
                if(flag==1)
                    flag=0;
                else
                    flag=1;
            }
            System.out.println();
        }

    }
}
