import java.util.Arrays;
import java.util.Scanner;

public class pair_Sum {
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
        System.out.println("Enter item to target:");
        int target=sc.nextInt();
        System.out.println("counting:"+pairSum(arr,target));
    }

    //function to find sum of pair to get target value
    public static int pairSum(int [] arr1,int target)
    {
        int ans=0;
        for (int i=0;i<arr1.length;i++)
        {
            for(int j=i+1;j<arr1.length;j++)
            {
                if(arr1[i]+arr1[j]==target)
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}
