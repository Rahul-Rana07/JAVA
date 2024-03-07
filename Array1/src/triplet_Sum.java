import java.util.Arrays;
import java.util.Scanner;

public class triplet_Sum {
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
        System.out.println("Enter target value:");
        int target=sc.nextInt();
        System.out.println("answer:"+tripletSum(arr,target));
    }
    // fumction to count the sum of three numbers is  equal to the target
    public static int tripletSum(int [] arr1, int target)
    {
        int ans=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=i+1;j<arr1.length;j++)
            {
                for(int k=j+1;k<arr1.length;k++)
                {
                    if(arr1[i]+arr1[j]+arr1[k]==target)
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
