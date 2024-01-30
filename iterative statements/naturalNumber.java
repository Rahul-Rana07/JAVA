import java.util.Scanner;

public class naturalNumber {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Natural number:"+i);
        }
    }
}
