import java.util.Scanner;

public class largestSmallestNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        char  choice;
        do {
            System.out.print("Enter a number:");
            int n=sc.nextInt();
            if (n>max)
            {
                max=n;
            }
            if (n<min)
            {
                min=n;
            }
            System.out.println("do you want to continue:");
            choice=sc.next().charAt(0);
        }while (choice=='y' || choice=='Y');
        System.out.println("maximum number:"+max);
        System.out.println("minimum number:"+min);
    }
}
