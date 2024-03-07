import java.util.Arrays;
import java.util.Scanner;

public class lastOccurrence {
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
        System.out.println("Enter element to find last occurence:");
        int element=sc.nextInt();
        System.out.println("last occurence of element:"+lastOccures(arr,element));
    }

    //function to find last occurrence of element in array
    public  static int lastOccures(int [] arr1,int x)
    {
        int counter=0;
        int ans=-1;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==x)
            {
                counter++;
                ans=i;
            }
        }
        return ans;
    }
}
