import java.util.Scanner;
public class prefix_Sum_in_2d {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows and columns of Matrix:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] a =new int[r][c];
        System.out.println("Enter element of Matrix :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter rectangle boundaries l1, r1, l2 , r2");
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        int l2= sc.nextInt();
        int r2= sc.nextInt();

        System.out.println("Rectangle sum:"+findSum(a,l1,r1,l2,r2));
    }
    // function to find the sum of rectangle

    public static int findSum(int [][] a,  int l1, int r1 , int l2 ,  int r2)
    {
        int sum=0;
        for(int i=l1;i<=l2;i++)
        {
            for(int j=r1;j<=r2;j++)
            {
                sum+= a[i][j];
            }
        }
        return  sum;
    }

}
