import java.util.Scanner;

public class negativeFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a negative number:");
        int n= sc.nextInt();
        for(int i=n;i<=Math.abs(n);++i)
        {
            if(i==0)
            {
                continue;
            }
            else
            {
                if(n%i==0)
                {
                    System.out.print(" "+i);
                }
            }
        }
    }
}
