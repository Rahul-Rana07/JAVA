import java.util.Arrays;
import java.util.Scanner;

/*class Array{

    void sum()
    {
        int [] arr2={1,3,5};
        int sum=0;
        for(int i=0;i<arr2.length;i++)
        {
            sum+=arr2[i];
        }
        System.out.println("Sum is:"+sum);
    }
}*/

public class sumArray {

    public static void main(String[] args) {
        //using method

        Scanner sc=new Scanner(System.in);
        int [] arr=new int[3];
        System.out.println("Enter element:");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array:"+ Arrays.toString(arr));
        sumOfArray(arr);

        //using class
/*
        Array obj1=new Array();
        obj1.sum();*/
    }

    //using method
    public static void sumOfArray(int [] arr1)
    {
        int sum=0;
        for(int i=0;i< arr1.length;i++)
        {
             sum+=arr1[i];
        }
        System.out.println("sum is:"+sum);
    }
}
