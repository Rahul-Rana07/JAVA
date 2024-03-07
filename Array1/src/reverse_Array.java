import java.util.Arrays;
import java.util.Scanner;

public class reverse_Array {
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
        int [] ans=reverseArray(arr);
        System.out.println("Array is:"+ Arrays.toString(ans));
    }

    // function for reverse an array
    public static int [] reverseArray(int [] arr1)
    {
        int n=arr1.length;
        int [] ans=new int[n];
        int i=n-1;
        int j=0;
        while (i>=0)
        {
         ans[j++]=arr1[i--];
        }
        return ans;
    }
}
