import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter digit:");
        int n= sc.nextInt();
        int a=n;
        int sum=0;
        int rem=0;
        while(n>0)
        {
            rem=n%10;
            sum =sum+rem;
            n/=10;
        }
        System.out.println("given number:"+a);
        System.out.print("sum of digit:"+sum);
    }
}
