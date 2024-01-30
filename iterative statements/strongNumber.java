import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter a number:");
        int n =sc.nextInt();
        int s=0,fact,n1,i,j;
        n1=n;
        for(j=n;j>0;j=j/10)
        {
            fact=1;
            for(i=1;i<=j%10;i++)
            {
                fact=fact*i;
            }
            s=s+fact;
        }
            if (s==n1)
            {
                System.out.print(s+" is a strong number");
            }
            else
            {
                System.out.println(s+" is not a strong number");
            }
    }
}
