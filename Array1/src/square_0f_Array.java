import java.util.Arrays;
import java.util.Scanner;

public class square_0f_Array {
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
        int []ans=squareArray(arr);
        reverseArrray(ans);
        System.out.println("Array squares:"+Arrays.toString(ans));
    }

    // function for returning an given array squares

    public static int [] squareArray(int [] arr1)
    {
        int n=arr1.length;
        int left=0, right=n-1;
        int k=0;
        int [] ans=new  int[n];
        while(left<=right)
        {
            if(Math.abs(arr1[left])>Math.abs(arr1[right]))
            {
                ans[k++]=arr1[left]*arr1[left];
                left++;
            }
            else
            {
                ans[k++]=arr1[right]*arr1[right];
                right--;
            }
        }
        return ans;
    }

    public static void reverseArrray(int[] arr2 )
    {
        int n=arr2.length;
        int left=0, right=n-1;
        while(left<right)
        {
            if(arr2[left]>arr2[right]) {
                int temp = arr2[left];
                arr2[left] = arr2[right];
                arr2[right] = temp;
                left++;
                right--;
            }
        }
    }
}
