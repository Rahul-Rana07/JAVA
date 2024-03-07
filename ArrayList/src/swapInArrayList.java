import java.util.ArrayList;
import java.util.Scanner;

public class swapInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        System.out.println("List:"+l1);
        System.out.println("Enter  two index to swap values");
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        swap(l1,1,3);
        System.out.println("After swap List:"+l1);
    }

    // function to swap values in arrayList
    public static void swap(ArrayList<Integer>l1, int n1, int n2)
    {
        int temp= l1.get(n1);
        l1.set(n1,l1.get(n2));
        l1.set(n2,temp);

    }
}
