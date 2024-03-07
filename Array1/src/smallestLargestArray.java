import java.util.Arrays;
import java.util.Scanner;

public class smallestLargestArray {
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
        int [] ans=smallestLargestArray(arr);
        System.out.println("Smallest:"+ans[0]);
        System.out.println("largest:"+ans[1]);
    }

    // function returns an array which  contain smallest and largest value in array

    public static int [] smallestLargestArray(int [] arr1)
    {
        Arrays.sort(arr1);
        int [] ans={arr1[0],arr1.length-1};
                return ans;
    }
}
