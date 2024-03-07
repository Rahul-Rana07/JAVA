import java.util.Scanner;

public class rotateMatrixBy90 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of row and column of  Matrix:");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int [][] a= new int[r][c];
        System.out.println("Enter Matrix elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        printArray(a);
        rotateMtrix(a,r);
        System.out.println("Rotated Matrix by 90:");
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

    //functon to rotate a matrix

    public static void rotateMtrix(int [][] a, int n)
    {
        transposeMatrix(a,n,n);
        for(int i=0;i<n;i++)
        {
            reverseArray(a[i]);
        }
    }

    // function to transpose of a matrix

    public static  void transposeMatrix(int [][] a, int r , int c)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=i;j<c;j++)
            {
                int temp= a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }

    // function to reverse the array elements
    public static void reverseArray(int []a)
    {
        int n=a.length;
        int i=0, j=n-1;
        while(i<=j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
}
