import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number:");
        int dividend=sc.nextInt();
        System.out.print("Enter second number:");
        int divisor=sc.nextInt();
        int rem,hcf=0;
        do{
            rem=dividend%divisor;
            if(rem==0)
            {
                hcf=divisor;
            }
            else
            {
                dividend=divisor;
                divisor=rem;
            }
        }while(rem!=0);
        System.out.println("hcf: "+hcf);
    }
}
