import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of row and column of  Matrix:");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int [][] a= new int[r][c];
        int total=r*c;
        System.out.println("Enter Matrix elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println(" Input Matrix:");
        printArray(a);

        System.out.println("Spiral Order:");
        printSpiralOrder(a,r,c);
    }

    // function to print an  array
    public static void printArray(int [][]a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    // function to print a spiral matrix order

    public static void printSpiralOrder(int [][] a , int r,  int c)
    {
        int topRow=0,bottomRow=r-1, leftCol=0, rightcol=c-1;
        int totalElements=0;
        while (totalElements<r*c)
        {
            // topRow-> leftCol to rightCol
            for(int j=leftCol;j<=rightcol && totalElements<r*c;j++)
            {
                System.out.print(a[topRow][j]+" ");
                totalElements++;
            }
            topRow++;

            // rightCol-> topRow ot bottomRow
            for(int i=topRow ;i<= bottomRow && totalElements<r*c;i++)
            {
                System.out.print(a[i][rightcol]+" ");
                totalElements++;
            }
            rightcol--;

            //bottomRow-> rightCol to leftCol
            for(int j=rightcol;j>=leftCol && totalElements<r*c;j--)
            {
                System.out.print(a[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            //leftcol-> bottomRow to topRow
            for(int i=bottomRow;i>=topRow && totalElements<r*c;i--)
            {
                System.out.print(a[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }
}
