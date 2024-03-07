import java.util.Scanner;

public class transposeOfMatrix {
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
        System.out.println("Matrix:");
        printArray(a);

        int [][] ans = transposeMatrix(a,r,c);
        System.out.println("Transpose of Matrix :");
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

    // functio for transpose of matrix

    public static int [][] transposeMatrix(int [][]a , int r, int c)
    {
         int [][]ans =new int[c][r];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                ans[i][j]=a[j][i];
            }
        }
        return ans;
    }
}
