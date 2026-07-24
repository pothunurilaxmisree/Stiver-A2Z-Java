import java.lang.*;

public class Pattern22{
    public static void main(String args[])
    {
        int n=4;
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<2*n-1;j++)
            {
                int top = i;
                int left=j;
                int right = 2*n-2-j;
                int bottom = 2*n-2-i;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right)));
            }
            System.out.println();
        }
    }
}


/*here first we are trying to create a matrix as follows

    0000000
    0111110
    0122210
    0123210
    0122210
    0111110
    0000000

    and then subtracting n (i.,e 4)
    Creating the above matrix is ass follows
    we take the min value of indexes of all corners for that particular value 
 */