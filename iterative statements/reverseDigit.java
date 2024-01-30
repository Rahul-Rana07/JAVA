import java.util.Scanner;

public class reverseDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int a=n;
        int rev=0;
        int rem=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/= 10;
        }
        System.out.println("given number:"+a);
        System.out.print("reverse number:"+rev);
    }
}
