import java.util.Scanner;

public class posZeroNeg {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int neg=0,pos=0,zero=0;
        char choice;
        do {
            System.out.print("Enter a number:");
            int n=sc.nextInt();
            if(n>0)
            {
                pos++;
            } else if (n<0) {
                neg++;
            }
            else
            {
                zero++;
            }
            System.out.print("do you want to continue y/n");
            choice=sc.next().charAt(0);
        }while (choice=='y'||choice=='Y');
        System.out.println("positive number:"+pos);
        System.out.println("negative number:"+neg);
        System.out.println("zero numbers:"+zero);
    }
}
