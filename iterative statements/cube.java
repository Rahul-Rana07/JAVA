import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        System.out.print("Enter number:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int cube=0;
        for (int i=1;i<=n;i++)
        {
            cube=i*i*i;
            System.out.println("Cube of:"+i+"="+cube);
        }
    }
}
