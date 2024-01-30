import java.util.*;
class demo{
    int reversearray(int array[],int n){
        int temp;
        int i;
        for( i=0;i<n;i++){
for(int j=0;i<n;j++){
    temp=array[i];
    array[i]=array[n];
    array[n]=temp;
    System.out.println(array[i]);
}

        }
        return array[i];
    }

}

public class reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number");
        int n=sc.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        demo obj=new demo();
        obj.reversearray(array,n);


    }

}
