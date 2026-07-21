import java.lang.*;

public class Pattern06{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            int flag=1;
            for(int j=i;j<=5;j++)
            {
                System.out.print(flag);
                flag++;
            }
            
            System.out.println();

        }
    }
}