import java.util.Arrays;
import java.util.Scanner;

public class copyArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size:");
    int n=sc.nextInt();

      // original array

        System.out.println("Enter array elements:");
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array:");
        printArry(arr);

        //copy array
        //shallow copy
       // int [] arr2=arr;

        //clone copy
     //   int [] arr2=arr.clone();
       // int [] arr2=Arrays.copyOf(arr,arr.length);
        int [] arr2=Arrays.copyOfRange(arr,0,n);

        System.out.println("Copied array:");
        printArry(arr2);

        // changing value in arr2

        arr2[0]=0;
        arr2[1]=0;
        System.out.println("Original array after changing value in arr2:");
        printArry(arr);

        System.out.println("Copied array after changing value in arr2:");
        printArry(arr2);


    }

    public static void printArry(int [] arr1){
        System.out.println("Array is: "+ Arrays.toString(arr1));
    }
}
