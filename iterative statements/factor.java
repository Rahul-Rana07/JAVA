import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.println("factors are:");
        int result=factors(n);
    }
    public static int  factors(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(" "+i);
                count++;
            }
        }
        return count;
    }
}
