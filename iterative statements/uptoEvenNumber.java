import java.util.Scanner;

public class uptoEvenNumber {
    public static void main(String[] args) {
        System.out.print("Enter number:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println("even number :"+i+" ");
            }
        }
    }
}
