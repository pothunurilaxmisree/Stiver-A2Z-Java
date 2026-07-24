import java.lang.*;

public class Pattern17{
    public static void main(String args[])
    {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            int l=65,r=64+i-1;
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                if(k<=i){
                    System.out.print((char)l);
                    l++;
                }
                else{
                    System.out.print((char)r);
                    r--;
                }
            }
            System.out.println();
        }
    }
}