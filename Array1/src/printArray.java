import java.util.Arrays;    
import java.util.Scanner;

public class printArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr= new int[10];
        System.out.print("Enter elements :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is:"+ Arrays.toString(arr));
    }
}
