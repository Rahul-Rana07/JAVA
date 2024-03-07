import java.util.Arrays;
import java.util.Scanner;

public class sort_Parity_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array element:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is:" + Arrays.toString(arr));
        sortArrayByParity(arr);
        System.out.println("sorted array :"+Arrays.toString(arr));
    }

    //function to sort even number at left and odd number at right

    public static void sortArrayByParity(int [] arr1)
    {
        int n =arr1.length;
        int left=0, right=n-1;
        while (left<right)
        {
            if(arr1[left] %2!=0 && arr1[right]%2==0)
            {
                swap(arr1,left,right);
                left++;
                right--;
            }

            if(arr1[left]%2 ==0)
                left++;


            if(arr1[right]%2 !=0)
                right--;
        }

    }

    // function for swapping

    public static void swap(int [] arr2, int i, int j)
    {
        int temp=arr2[i];
        arr2[i]=arr2[j];
        arr2[j]=temp;
    }

}

