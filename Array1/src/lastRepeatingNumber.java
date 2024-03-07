import java.util.Arrays;
import java.util.Scanner;

public class lastRepeatingNumber {
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
        System.out.println("Last repeating number:"+findLastRepeatingNumber(arr));
    }

    //function to find last repeating number in array
    public static int findLastRepeatingNumber(int [] arr1)
    {
        int ans=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=i+1;j<arr1.length;j++)
            {
                if(arr1[i]==arr1[j])
                {
                    ans= arr1[i];
                }
            }
        }
        return ans;
    }
}
