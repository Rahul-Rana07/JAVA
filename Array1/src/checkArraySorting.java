import java.util.Arrays;
import java.util.Scanner;

public class checkArraySorting {
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
        boolean loc;
        loc=isSorted(arr);
        if(loc==true)
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is unsoted");
        }
    }

    //funcion to check array  is sorted or not

    public static boolean isSorted(int [] arr1)
    {
        for(int i=1;i<arr1.length;i++)
        {
            if(arr1[i]<arr1[i-1])
                return false;
        }
        return true;
    }
}
