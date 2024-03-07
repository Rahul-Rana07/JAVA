import java.util.Scanner;

public class multilplicationOfMatrix {
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
        System.out.println("Enter elements of Matrix 2:");
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

        int [][] ans=multiplicationMatrix(a,r1,c1,b,r2,c2);
        System.out.println("Multiplication of Matrix 1 and Matrix 2:");
        printArray(ans);
    }

    // function for printing a 2d array
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

    //function for multipliction of an array
    public static int [][] multiplicationMatrix(int [][] a, int r1, int c1, int [][] b , int r2, int c2)
    {
        if(c1!=r2)
        {
            System.out.println(" Wrong Input- Multipliation of matrix is not possible");
        }
        int [][]mul=new int[r1][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return mul;
    }
}
