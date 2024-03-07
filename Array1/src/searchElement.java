import java.util.Arrays;
import java.util.Scanner;

public class searchElement {

    public static void main(String[] args) {

        //call using class in main funcion

        Array1 obj5=new Array1();
        obj5.search();


        //call using method in main function

        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        int loc=0;
        System.out.println("Enter element:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is:"+ Arrays.toString(arr));
        System.out.println("Enter item to search:");
        int item=sc.nextInt();
       loc= search(arr,item);
        if(loc==-1)
        System.out.println("Item does not exist");
        else
            System.out.println("Item:"+item+" Exist at index:"+loc);
    }
    //method

    public static int  search(int [] arr1,int item)
    {
        int loc=-1;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==item)
            {
                return loc= i;
            }
        }
        return loc;
    }


}

//using class

 class Array1{
    void search() {
        int loc=-1;
        int[] arr1 = {11, 5, 17, 21};
        int item = 17;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]== item)
                loc=i;
            break;
        }
        if(loc==-1)
            System.out.println("not found");
        else
        System.out.println("found:"+item+" at index:"+ loc);
    }

 }

