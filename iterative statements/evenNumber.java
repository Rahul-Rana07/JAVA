import java.util.Scanner;

public class evenNumber {
    public static void main(String [] args)
    {
        System.out.print("Enter number:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2 ;i<=n;i+=2)
        {
            System.out.println("Even number :"+ i);
        }
    }
}
