import java.util.Scanner;

public class sumOfMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows and columns in Matrix 1:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [][] a=  new int [r1][c1];
        System.out.println("Enter elements of Matrix 1:");
        for (int i=0;i<r1;i++)
        {
            for (int j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter number of rows and columns in Matrix 2:");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int [][] b=  new int [r2][c2];
        System.out.println("Enter elements of Matrix 1:");
        for (int i=0;i<r2;i++)
        {
            for (int j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix 1:");
        printArray(a);

        System.out.println("Matrix 2:");
        printArray(b);
         sumOfMatrices(a,r1,c1,b,r2,c2);
    }

    //method for printing a 2d array

    public static void printArray(int [][]a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }

    // method for sum of matrices

    public static void sumOfMatrices(int [][] a ,int r1, int c1, int [][] b,int r2, int c2 )
    {
        if(r1!=r2 || c1!=c2)
        {
            System.out.println("Wrong Input! sum is not possible");
            return ;
        }

        int [][] sum= new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of Matrix1 and Matrix 2 :");
        printArray(sum);
    }
}
