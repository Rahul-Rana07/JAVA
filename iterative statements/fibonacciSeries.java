import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter number of terms:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int t1=0,t2=1;
        int next_term;
        System.out.print("fibonacci series :"+t1+t2);
        for(int i=1;i<=n-2;i++)
        {
            next_term=t1+t2;
            System.out.print(next_term);
            t1=t2;
            t2=next_term;
        }
    }
}
