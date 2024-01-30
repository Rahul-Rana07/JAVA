import java.util.Scanner;

public class checkPerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(n==sum)
        {
            System.out.print(n+ " is a perfect number");
        }
        else
        {
            System.out.print(n+ " is not a perfect number");
        }

    }
}
