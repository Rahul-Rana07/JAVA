import java.util.Scanner;

public class checkPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int rev=0,rem,temp;
        temp=n;
        while (n!=0)
        {
         rem=n%10;
         rev=rev*10+rem;
         n/=10;
        }
        if(temp==rev)
        {
            System.out.print(temp+" is a palindrome number");
        }
        else
        {
            System.out.print(temp+" is not a palindrome number");
        }
    }
}
