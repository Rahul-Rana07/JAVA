import java.util.Arrays;
import java.util.Scanner;

public class maxElement {
    public static void main(String[] args) {
        //call using method in main fuction

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is:" + Arrays.toString(arr));
        max(arr);

        //call using class in main function

        Array obj1=new Array();
        obj1.maxElement();
    }

        // method

        public static void max(int [] arr1) {
            int ans=0;
         for(int i=0;i<arr1.length;i++)
         {
                 if(arr1[i]>ans)
                 {
                     ans=arr1[i];
                 }
         }
            System.out.println("max element:"+ans);
    }
}

// using class

class Array{
    void maxElement()
    {
        int [] arr1={1,5,3};
        int ans=0;
        for(int i=0;i<arr1.length;i++)
        {
                if(arr1[i]>ans)
                {
                    ans=arr1[i];
                }
        }
        System.out.println("max element :"+ans);
    }
}
