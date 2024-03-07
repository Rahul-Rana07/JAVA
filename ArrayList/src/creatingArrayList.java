import java.util.ArrayList;

public class creatingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        //ArrayList<Boolean>b1=new ArrayList<>();


        //add an element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get an element index i
        System.out.println(l1.get(1));

        // print with for loop
        for(int i=0;i< l1.size();i++)
        {
            System.out.println(l1.get(i));
        }

        // print arrayList directly
        System.out.println(l1);

        //add element at some index i
        l1.add(1,100);
        System.out.println(l1);

        //modifying value at index i
        l1.set(1,10);
        System.out.println(l1);

        //removing an element index
        l1.remove(2);
        System.out.println(l1);

        //removing an element value
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        //check if an element exist
        boolean ans=l1.contains(Integer.valueOf(10));
        System.out.println(ans);

        //if you cant specify a class you can add anything in list
        ArrayList l= new ArrayList();
        l.add("Rahul");
        l.add(7);
        l.add(true);
        System.out.println(l);

    }
}
