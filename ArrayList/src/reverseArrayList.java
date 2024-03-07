import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(10);
        System.out.println("Original List:"+ l1);
        Collections.reverse(l1);
      //  reverseArraylist(l1);
        System.out.println("Reverse list:"+l1);
    }

    //function to reverse the array list
    public static void reverseArraylist(ArrayList<Integer> l1)
    {
        int n= l1.size();
        int i=0, j=n-1;
        while(i<j)
        {
            Integer temp= Integer.valueOf(l1.get(i));
            l1.set(i, l1.get(j));
            l1.set(j,temp);
            i++;
            j--;
        }
    }
}
