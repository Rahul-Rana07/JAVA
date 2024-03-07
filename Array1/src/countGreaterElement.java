import java.util.Arrays;
import java.util.Scanner;

public class countGreaterElement {
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
        System.out.println("Enter element to find greater elements number:");
        int element=sc.nextInt();
        System.out.println("Greater than "+element+":"+countGreaterElements(arr,element));
    }

  //function to count greater elements than given element

  public static int countGreaterElements(int [] arr1,int x)
  {
      int count=0;
      for(int i=0;i<arr1.length;i++)
      {
          if(arr1[i]>x)
          {
              count++;
          }
      }
      return count;
  }
}
