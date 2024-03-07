import java.util.Arrays;
import java.util.Scanner;

public class countOccurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter element of array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is:"+ Arrays.toString(arr));
        System.out.print("Enter element to find occurence:");
        int element=sc.nextInt();
        System.out.println("occurence is :"+countOccures(arr,element));
    }

    //function of count occurrence

    public static int countOccures(int [] arr1,int x)
    {
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==x)
                count++;
        }
        return count;
    }
}
