import java.util.Scanner;

public class sumUsingLoop {
    public static void main(String []args)
    {
        int sum= 0;
        System.out.print("enter number:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n;i++)
        {
           sum = sum+i;
        }
        System.out.println("sum of n natural number is:"+sum);
    }
}
