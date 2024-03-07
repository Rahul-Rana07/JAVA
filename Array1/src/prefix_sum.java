import java.util.Arrays;
import java.util.Scanner;

public class prefix_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter array element:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is:"+ Arrays.toString(arr));
        int [] ans=prefixSum(arr);
        System.out.println("Array prefix sum:"+Arrays.toString(ans));
    }

    //function for prefix sum in array

    public static int [] prefixSum(int [] arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            if(i>=1)
            {
                arr[i]=arr[i-1]+arr[i];
            }
        }
        return arr;
    }
}
