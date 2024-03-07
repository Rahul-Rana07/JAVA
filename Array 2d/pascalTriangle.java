import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        int [][] ans=pascal(n);
        printArray(ans);
    }

    // function to print an  array
    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    //function to print a n number of pascal triangle
    public static int [][] pascal(int n)
    {
        int [][] ans= new int[n][];
        for(int i=0;i<n;i++)
        {
           ans[i]=new int[i+1];
           ans[i][0]=ans[i][i]=1;
           for(int j=1;j<i;j++)
           {
               ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
           }
        }
        return ans;
    }
}
