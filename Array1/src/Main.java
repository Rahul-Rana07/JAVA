class ArrayExample
{
    void multiArry(){
        int [][] arr1=new int[2][3];
        int[][] arr={{5,10,15}, {20,25,30}};

        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

   /*     System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);*/
}

    void array()
    {
        int [] ages=new int[3];
        String [] names =new String[3];

        ages[0]=19;
        ages[1]=26;
        ages[2]=21;

        names[0]="Rahul Rana";
        names[1]="Ronnie Thakur";
        names[2]="Sharad Banga";

        //for each loop
 /*       for(int age: ages)
        {
            System.out.println(age);
        }
*/
//for loop
      /*  for(int i=0;i<ages.length;i++)
        {
            System.out.println(ages[i]);
            System.out.println(names[i]);
        }*/
//manualy
       /* System.out.println("Name:"+names[1]+"  age:"+ages[1]);
        System.out.println("Name:"+names[0]+"  age:"+ages[0]);
        System.out.println("Name:"+names[2]+"  age:"+ages[2]);*/
    }

}

public class Main {
    public static void main(String[] args) {
       //ArrayExample obj=new ArrayExample();
       //obj.array();

       ArrayExample obj2=new ArrayExample();
       obj2.multiArry();
        }
}