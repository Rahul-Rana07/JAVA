import java.util.Arrays;
import java.util.Scanner;

public class find_UniqueNumber {
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
        System.out.print("unique number:"+ uniqueNumber(arr));
    }

    //function to find a unique number where all number are reapeated twice except one
    public static int  uniqueNumber(int [] arr1)
    {
        int ans=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=i+1;j<arr1.length;j++)
            {
                if(arr1[i]==arr1[j])
                {
                    arr1[i]=-1;
                    arr1[j]=-1;
                }
            }
        }

        for(int k=0;k<arr1.length;k++)
        {
            if(arr1[k]!=-1)
            {
                ans= arr1[k];
            }
        }
        return ans;
    }
}
