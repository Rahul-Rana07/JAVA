import java.util.Arrays;
import java.util.Scanner;

public class sort01Array {
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
        sort01Araay(arr);
        System.out.println("Soterd array:");
        System.out.println(Arrays.toString(arr));
    }

    //function to sort an  array of 0 and 1
    public static void sortArray(int [] arr1)
    { int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==0)
            {
                count++;
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            if(i<count)
            {
                arr1[i]=0;
            }
            else
            {
                arr1[i]=1;
            }
        }
    }

    //another function / mehtod to sort array

    public static void sort01Araay(int [] arr)
    {
        int n=arr.length;
        int left=0, right=n-1;
        while (left<right)
        {
            if(arr[left]==1&& arr[right]==0)
            {
                swap(arr,left,right);
                left++;
                right--;
            }

            if(arr[left]==0)
                left++;

            if(arr[right]==1)
                right--;
        }
    }

    // function to swap
    public static void swap(int [] arr2,int i, int j)
    {
        int temp=arr2[i];
        arr2[i]=arr2[j];
        arr2[j]=temp;
    }
}
