import java.util.Scanner;

public class inPlaceTranspose {
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
       transposeMatrix(a,r,c);
        System.out.println("Transpose Matrix:");
       printArray(a);
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

    // method  for transpose of matrix without using extra space  only apply for square matrix
    public static void transposeMatrix(int [][]a , int r ,int c)
    {
        for(int i=0;i<c;i++)
        {
            for(int j=i;j<r;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
}
