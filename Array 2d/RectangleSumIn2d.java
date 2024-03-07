import java.util.Scanner;

public class RectangleSumIn2d {
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

    // function to find the prefix of matrix
    public static void findPrefixSumMatrix(int [][] a)
    {
        int r=a.length;
        int c=a[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=1;j<c;j++)
            {
                a[i][j]+= a[i][j-1];
            }
        }
    }
    // function to find sum of rectangle
    public static int findSum(int [][] a,  int l1, int r1 , int l2 ,  int r2)
    {
        int sum=0;
        findPrefixSumMatrix(a);
        for(int i=l1;i<=l2;i++)
        {
            if(r1>=1)
            sum+= a[i][r2]-a[i][r1-1];
            else
                sum+=a[i][r2];
        }
        return  sum;
    }
}
