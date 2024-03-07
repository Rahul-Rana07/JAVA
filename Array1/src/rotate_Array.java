import java.util.Arrays;
import java.util.Scanner;

public class rotate_Array {
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
        System.out.println("Enter step to rotate array:");
        int k=sc.nextInt();
        int [] ans=rotateArray(arr,k);
        System.out.println("Array after rotation:");
        System.out.println(Arrays.toString(ans));
    }

    //funcion to roate a array by kth step

    public static int [] rotateArray(int [] arr1, int k)
    {
        int n=arr1.length;
        k=k%n;
         int [] ans =new int[n];
         int j=0;

         for(int i=n-k;i<n;i++)
         {
             ans[j++]=arr1[i];
         }

         for(int i=0;i<n-k;i++)
         {
             ans[j++]=arr1[i];
         }
         return ans;
    }
}