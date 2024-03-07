import java.util.ArrayList;
import java.util.Collections;

public class sortString {
    public static void main(String[] args) {
        ArrayList<String> l1= new ArrayList<>();
        l1.add("Welcome");
        l1.add("to");
        l1.add("Coding");
        l1.add("World");
        System.out.println("Original String:"+l1);
        Collections.sort(l1);
        System.out.println("Sorted in ascending order:"+l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Soretd in descending order:"+l1);
    }
}
