import java.lang.*;

public class Pattern03{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            int flag=1;
            for(int j=0;j<i;j++)
            {
                System.out.print(flag);
                flag++;
            }
            System.out.println();

        }
    }
}