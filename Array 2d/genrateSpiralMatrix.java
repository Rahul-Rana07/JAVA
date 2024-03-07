import java.util.Scanner;

public class genrateSpiralMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int [][] a= genrateSpiralMatrix(n);
        printArray(a);
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

    public static int [][] genrateSpiralMatrix(int n)
    {
        int [][] a=new int[n][n];
        int topRow=0 ,bottomRow=n-1, leftCol=0, rightCol=n-1;
        int curr=1;

        while(curr <= n*n)
        {
            //topRow-> leftCol to rightCol
            for(int j=leftCol ;j <= rightCol && curr <= n*n; j++)
            {
                a[topRow][j]=curr;
                curr++;
            }
            topRow++;

            // rightCol->topRow to bottomRow
            for(int i=topRow ; i <= bottomRow && curr <= n*n; i++)
            {
                a[i][rightCol]=curr;
                curr++;
            }
            rightCol--;

            // bottomRow-> rightCol to leftCol
            for(int j=rightCol ; j >= leftCol && curr <= n*n; j--)
            {
                a[bottomRow][j]=curr;
                curr++;
            }
            bottomRow--;

            // leftCol-> bottomRow to topRow
            for(int i=bottomRow; i >= topRow && curr <= n*n;i--)
            {
                a[i][leftCol]=curr;
                curr++;
            }
            leftCol++;
        }
        return a;
    }
}
