import java.util.Scanner;

public class sumAndAverage {
    public static void main(String[] args) {
        System.out.print("Enter five numbers:");
        int i=0,sum=0;
        double avg;
        for( i=1;i<=5;i++)
        {
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            sum+=n;
        }
        avg=sum/5;
        System.out.println("sum of number :"+sum);
        System.out.print("average of number:"+avg);
    }
}
