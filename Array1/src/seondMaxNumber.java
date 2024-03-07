import java.util.Arrays;
import java.util.Scanner;

public class seondMaxNumber {
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
        System.out.println("Second max number:"+secMax(arr));
    }

    //function to find max number
    public static int maxNumber(int []arr1) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        return max;
    }
        //function to find second max

        public static int secMax(int [] arr2)
        {
         int max=maxNumber(arr2);
         for(int i=0;i<arr2.length;i++)
         {
             if(arr2[i]==max)
             {
                 arr2[i]=Integer.MIN_VALUE;
             }
         }
         int secMax=maxNumber(arr2);
         return secMax;
        }
}
