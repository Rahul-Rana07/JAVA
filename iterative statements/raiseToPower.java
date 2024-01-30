import java.util.Scanner;

public class raiseToPower {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter base number:");
        int base=sc.nextInt();
        System.out.print("Enter raised to power number:");
        int power=sc.nextInt();
        int result=1;
        for(int i=1;i<=power;i++)
        {
            result*=base;
        }
        System.out.print("result:"+result);
    }
}
