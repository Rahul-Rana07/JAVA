import java.util.Arrays;
import java.util.Scanner;

public class prefix_range_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int [] arr=new int[n+1];
        System.out.print("Enter array element:");
        for(int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is:"+ Arrays.toString(arr));
        System.out.println("Enter number of quaries:");
        int q=sc.nextInt();
        while (q-->0) {
            System.out.println("Enter starting range:");
            int l = sc.nextInt();
            System.out.println("Enter last range:");
            int r = sc.nextInt();
            System.out.println("sum :"+prefixRangeSum(arr,l,r));
        }
    }

    // function to find preix sum of array at particular range
    public static int prefixRangeSum(int []arr, int l, int r)
    {
        int sum=0;
        int n=arr.length;
        for(int i=l;i<=r;i++)
        {
            arr[i]+=arr[i-1];
        }
      sum= arr[r] - arr[l-1];
        return sum;
    }
}
