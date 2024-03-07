import java.util.Arrays;

public class swapUsingVariable {
    public static void main(String[] args) {
      int a=9;
      int b=3;
      int [] arr={1,2,3,4,5};
        System.out.println("Array is:"+ Arrays.toString(arr));
        swap(a,b);
        swapp(a,b);
    }
    //function for swapping using 3rd variable

    public static void swap(int a, int b)
    {
        System.out.println("original value before swapping:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("value after swapping :");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }

    //function swapp without using 3rd varible
    public static void swapp(int a,int b)
    {
        System.out.println("original value before swapping:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value after swapping :");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
