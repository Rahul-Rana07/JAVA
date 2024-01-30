import java.util.Scanner;

public class sumOddNumber {
    public static void main(String[] args) {
        System.out.print("Enter number:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum+=n;
                System.out.println("odd number:"+i);
            }
        }
        System.out.println("sum of odd number:"+sum);
    }
}
