import java.util.Scanner;

public class checkArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number:");
        int n= sc.nextInt();
        int result=armstrong(n);
        if(result==n)
        System.out.print(n+" is a armstrong number");
        else
            System.out.println(n+" is not a armstrong number");
    }

    public static int armstrong(int num)
    {
        int x,a=0;
        while (num!=0)
        {
            x=num%10;
            a=a+(x*x*x);
            num/=10;
        }
        return a;
    }
}
