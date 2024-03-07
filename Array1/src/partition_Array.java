import java.util.Arrays;
import java.util.Scanner;

public class partition_Array {
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
        System.out.println("Equal Partition Possible:"+euqalSumPartition(arr));
    }
    // function to fid array sum
    static int arraySum(int [] arr)
    {
        int totalSum=0;
        for(int i=0;i<arr.length;i++)
        {
            totalSum+=arr[i];
        }
        return totalSum;
    }

    //method for parition of equal sum

    public static boolean euqalSumPartition(int []  arr)
    {
        int totalSum=arraySum(arr);
        int prefSum=0;
        for(int i=0;i<arr.length;i++)
        {
            prefSum += arr[i];
            int suffixSum=totalSum-prefSum;

            if(prefSum== suffixSum)
                return true;
        }
        return false;
    }
}
