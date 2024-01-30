import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args)
    {
        System.out.print("Enter number:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
                boolean isPrime = true;
                if(n<=1)
                {
                    isPrime= false;
                }
                else
                {
                    for(int i=2; i*i <=n; i++)
                    {
                        if(n%i == 0)
                        {
                            isPrime= false;
                        }
                    }
                }
                if(isPrime) {
                    System.out.println(n + " is a prime number");
                }
                else {
                    System.out.println(n + " is not a prime number");
                }
    }
}
