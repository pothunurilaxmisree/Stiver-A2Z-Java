import java.lang.*;

public class Pattern04{
    public static void main(String args[])
    {
        int flag=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(flag);
            }
            flag++;
            System.out.println();

        }
    }
}