import java.util.ArrayList;

public class maxInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>l1= new ArrayList<>();
        l1.add(10);
        l1.add(5);
        l1.add(7);
        l1.add(9);
        l1.add(11);
        l1.add(4);
        System.out.println("List:"+l1 );
         int res= maxArrayList(l1);
        System.out.println("Max number in arraylist :"+res);
    }

    // function to find max in arraylist

    public static int maxArrayList(ArrayList<Integer>l1)
    {
        int maxNum=Integer.MIN_VALUE;
        for(int i=0;i<l1.size();i++)
        {
            if(l1.get(i)>maxNum)
            {
                maxNum=l1.get(i);
            }
        }
        return maxNum;
    }
}
