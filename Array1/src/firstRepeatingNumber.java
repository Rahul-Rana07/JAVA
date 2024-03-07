import java.util.Arrays;
import java.util.Scanner;

public class firstRepeatingNumber {
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
        System.out.println("First repeating number:"+findFirstRepeatingNumber(arr));
    }

    //function to find first repeating number in array
    public static int findFirstRepeatingNumber(int [] arr1)
    {
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=i+1;j<arr1.length;j++)
            {
                if(arr1[i]==arr1[j])
                {
                    return arr1[i];
                }
            }
        }
        return -1;
    }
}
