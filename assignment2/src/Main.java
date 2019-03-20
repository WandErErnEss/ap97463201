import java.util.*;
public class Main {

    public static void main(String args[])
    {
        int i,j,n;
        System.out.print("enter n:");
        Scanner a=new Scanner(System.in);
        n=a.nextInt();
        if (n%2==0) {
            System.out.println("Error!");
            return;
        }
        n=n-(n/2);
        for(i=1;i<=n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i=n;i>=1;i--)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(j=2;j<(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
